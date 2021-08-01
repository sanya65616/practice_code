package MyPackage1;

public class APIResponseParser {
	/**
	 * Parses the input text and returns a Book instance containing
	 * the parsed data. 
	 * @param response text to be parsed
	 * @return Book instance containing parsed data
	 */
     public static Book parse(String response) {
        Book book = new Book();
        
		
		String startRuleForTitle = "<title>";	
		String endRuleForTitle = "</title";	
		String title = parse(response, startRuleForTitle, endRuleForTitle); 
	    book.setTitle(title);
		
		// Your code
	   
	    String startRuleForPublicationYear =  "<original_publication_year type=\"integer\">";
	    String endRuleForPublicationYear = "</original_publication_year>";
	    String publicationYearInString = parse(response, startRuleForPublicationYear, endRuleForPublicationYear);
	    int publicationYear = Integer.parseInt(publicationYearInString);
	    book.setPublicationYear(publicationYear);
	    
	    String startRuleForImageUrl = "<image_url>";	
	    String endRuleForImageUrl = "</image_url>";
		String imageUrl = parse(response, startRuleForImageUrl, endRuleForImageUrl); 
	    book.setImageUrl(imageUrl);
	    
	    String startRuleForAuthor = "<name>";		
	    String endRuleForAuthor = "</name>";
		String author = parse(response, startRuleForAuthor, endRuleForAuthor); 
	    book.setAuthor(author);
	    
	    String startRuleForAverageRating = "<average_rating>";		
	    String endRuleForAverageRating = "</average_rating>";	
	    String averageRatingInString = parse(response, startRuleForAverageRating, endRuleForAverageRating);
		double averageRating = Double.parseDouble(averageRatingInString); 
	    book.setAverageRating(averageRating);
	    
	    String startRuleForRatingsCount = "<ratings_count type=\"integer\">";	
	    String endRuleForRatingsCount = "</ratings_count>";
	    String ratingsCountInString = parse(response, startRuleForRatingsCount, endRuleForRatingsCount);
	    String ratingsCountExtracted = ratingsCountInString.replace(",", "");
		int ratingsCount = Integer.parseInt(ratingsCountExtracted); 
	    book.setRatingsCount(ratingsCount);
		
	    
		return book;
     }
     
     // write overloaded parse method with the 3 parameters response, startRule, endRule
     private static String parse(String response, String startRule, String endRule) {
    	 int startRuleIndex = response.indexOf(startRule);
    	 int firstIndex = response.indexOf(">", startRuleIndex);
    	 //System.out.println(firstIndex);
    	 int lastIndex = response.indexOf(endRule);
    	// System.out.println(lastIndex);
    	 String value = response.substring(firstIndex + 1, lastIndex);
    	 //String value =  response.substring(((response.indexOf(startRule))+ startRule.length()), response.indexOf(endRule));
		 return value;
    	 
     }
     
     public static void main(String[] args) {
		String response = "<work>" + 
	                            "<id type=\"integer\">2361393</id>" +
	                            "<books_count type=\"integer\">813</books_count>" +
	                            "<ratings_count type=\"integer\">1,16,315</ratings_count>" + 
	                            "<text_reviews_count type=\"integer\">3439</text_reviews_count>" +
	                            "<original_publication_year type=\"integer\">1854</original_publication_year>" +
								"<original_publication_month type=\"integer\" nil=\"true\"/>" +
								"<original_publication_day type=\"integer\" nil=\"true\"/>" +
								"<average_rating>3.79</average_rating>" +
								"<best_book type=\"Book\">" +
									"<id type=\"integer\">16902</id>" +
									"<title>Walden</title>" + 
									"<author>" +
										"<id type=\"integer\">10264</id>" + 
										"<name>Henry David Thoreau</name>" + 
									"</author>" +
									"<image_url>" + 
										"http://images.gr-assets.com/books/1465675526m/16902.jpg" +
									"</image_url>" +
									"<small_image_url>" + 
										"http://images.gr-assets.com/books/1465675526s/16902.jpg" +
									"</small_image_url>" +
								"</best_book>" +
							"</work>";
		
		APIResponseParser.parse(response);
	}

}
