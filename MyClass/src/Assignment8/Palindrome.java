package Assignment8;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str1 = scan.next();
		StringBuffer str2 = new StringBuffer(str1);
		str2 = str2.reverse();
		String str3 = str2.toString();
		if(str1.compareToIgnoreCase(str3) == 0) {
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not palindrome");
		}
	}

}
