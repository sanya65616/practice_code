package lab;

public class VowelAndConsonent {
	public static void check(char c) {
		if(c >= 97 && c <= 122) {
			if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				System.out.println("character given is vowel");
			}
			else
				System.out.println("character given is consonent");
		}
		
	}
	public static void main(String[] args) {
		char c = 'g';
		check(c);
	}

}
