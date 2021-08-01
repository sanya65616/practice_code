package Assignment7;

public class NumberOfCharacter {
	public static void main(String[] args) {
		String str;
		str = "life is beautiful";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ')
			count++;
		}
		System.out.println("The number of character in a string is: " + count);
	}
}
