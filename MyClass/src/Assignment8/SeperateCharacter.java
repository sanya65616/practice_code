package Assignment8;

import java.util.Scanner;

public class SeperateCharacter {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string:");
		String str = scan.nextLine();
		seperateChar(str); 
	}
	public static void seperateChar(String str) {
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) != ' ') {
				char[] c = str.toCharArray();
				System.out.println(c[i]);
			}
		}
	}

}
