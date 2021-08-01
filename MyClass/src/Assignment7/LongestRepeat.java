package Assignment7;

import java.util.Scanner;

public class LongestRepeat {
	public static void main(String[] args) {
		//Scanner scan = new Scanner(System.in);
		//System.out.println("Enter any string:");
		String str = "aabbaa"; //scan.next();
		char[] c = str.toCharArray();
		for(int i = 0; i < str.length(); i++) {
			for(int j = i + 1; j < str.length(); j++) {
				if(c[i] == c[j]) {
					System.out.print(c[j]);
					break;
				}
			}
		}
	}
}
