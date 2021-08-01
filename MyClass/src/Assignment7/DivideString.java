package Assignment7;

import java.util.Scanner;

public class DivideString {
	public static void main(String[] args) {
		String str;
		System.out.println("Enter any string: ");
		Scanner scan = new Scanner(System.in);
		str = scan.next();
		System.out.println("Enter number to divide String: ");	
		int n = scan.nextInt();
		for(int i = 0; i < str.length(); i = i + n) {
			System.out.println(str.substring(i, i + n));	
		}
	}
}
