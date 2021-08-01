package Assignment7;

public class NumberOfPunctuation {
	public static void main(String[] args) {
        String str = "Good Morning! Mr. James Potter. Had your breakfast?";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			 if(str.charAt(i) == '!' || str.charAt(i) == ',' || str.charAt(i) == ';' || str.charAt(i) == '.' || 
					 str.charAt(i) == '?' || str.charAt(i) == '-' ||  
	                    str.charAt(i) == '\'' || str.charAt(i) == '\"' || str.charAt(i) == ':')
			count++;
		}
		System.out.println("The number of punctuation characters in a string is: " + count);
	}

}
