package Assignment8;

import java.util.Scanner;

public class ReverseString {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str1 = scan.next();
		StringBuffer str2 = new StringBuffer(str1);
		str2 = str2.reverse();
		System.out.println("Reverse of given string: " + str2);
	}
}
