package Assignment8;

import java.util.Scanner;

public class DuplicateCharacter {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string:");
		String str = scan.nextLine();
		duplicateChar(str); 
	}
	public static void duplicateChar(String str) {
		int[] count = new int[str.length()];
		char[] string = str.toCharArray();
		for(int i = 0; i < string.length; i++) {
			count[i] = 1;
			char character = string[i];
			for(int j = i + 1; j < string.length; j++) {
				if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					count[i]++;
					string[j] = '0';
				}
			}
			if(count[i] > 1)
			System.out.println(character + ":" + count[i]);
		}
	}
}
