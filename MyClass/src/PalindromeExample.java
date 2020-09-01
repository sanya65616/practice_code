import java.util.Scanner;

public class PalindromeExample {
	
	public static boolean isPalindrome(String str) {
		int i, j;
		boolean isPalindrome = true;
		for(i = 0, j = str.length()-1; i <= j; i++,j--) {
		   if(str.charAt(i) != str.charAt(j))
			   return isPalindrome = false;   
		}
		return isPalindrome;
	}
	
	public static void main(String args) {
		String string;
		Scanner scan = new Scanner(System.in);
		string = scan.nextLine();
		if(isPalindrome(string)) {
			System.out.println("Its a palindrome");
		}
		else {
			System.out.println("Its not a palindrome");
		}
		scan.close();
	}

}
