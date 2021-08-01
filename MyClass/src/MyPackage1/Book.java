package MyPackage1;

public class Book {	
    private String title;
	private String author;
	private int publicationYear;
	private double averageRating;
	private int ratingsCount;
	private String imageUrl;
	
	// Add getters & setters for author, averageRating, and ratingsCount
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
		System.out.println(this.title);
	}
	
	public int getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
		System.out.println(this.publicationYear);
	}
	
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
		System.out.println(this.imageUrl);
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
		System.out.println(this.author);
	}
	
	public double getAverageRating() {
		return averageRating;
	}
	public void setAverageRating(double averageRating) {
		this.averageRating = averageRating;
		System.out.println(this.averageRating);
	}
	
	public int getRatingsCount() {
		return ratingsCount;
	}
	public void setRatingsCount(int ratingsCount) {
		this.ratingsCount = ratingsCount;
		System.out.println(this.ratingsCount);
	}
}
