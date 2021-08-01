package Assignment7;

import java.util.Scanner;

public class Substring {
	public static void main(String[] args) {
		String str;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any String: ");
		str = scan.nextLine();
		System.out.println("Substring of entered string: ");
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j <= str.length(); j++) {
				System.out.println(str.substring(i, j));
			}
		}
	}
}


