package Assignment1;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
	int  reverse = 0;
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter any number:");
	int n = scan.nextInt();
	for(int i = n; i > 0; i = i/10) {
		int remainder = i % 10;
		reverse = reverse * 10 + remainder;
	}
	if(n == reverse) 
		System.out.print(n + " is a Palindrome number");
	else
		System.out.print(n + " is not a Palindrome number");
	}

}
