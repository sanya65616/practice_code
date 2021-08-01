package Assignment7;


public class NumberOfVowelConsonent {
	static String str = "Two things are infinite: the universe and human stupidity; and I'm not sure about the universe.";
	static int vowelCount = 0;
	static int consonentCount = 0;
	
	public static int countVowel(String s) {
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			 if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
			vowelCount++;
		}
		return vowelCount;
		}
	
	public static int countConsonent(String s) {
		str = str.toLowerCase();
		for(int i = 0; i < str.length(); i++) {
			if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') && str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i'
					&& str.charAt(i) != 'o' && str.charAt(i) != 'u')
				consonentCount++;
		}
		return consonentCount;
	}
	
	public static void main(String[] args) {
		int vowels = countVowel(str);
		int consonents = countConsonent(str);
		System.out.println("The number of vowels in a string is: " + vowels);
		System.out.println("The number of consonent in a string is: " + consonents);
	}
}


