package Assignment8;

import java.util.Scanner;

public class MaxMinOccurance {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string:");
		String str = scan.nextLine();
		char max = maxCharacter(str);
		char min = minCharacter(str);
		System.out.println("Maximum Character in a string: " + max);
		System.out.println("Minimum Character in string: " + min);
	}
	public static char maxCharacter(String str) {
		int[] count = new int[str.length()];
		char[] string = str.toCharArray();
		char maxChar = str.charAt(0);
		for(int i = 0; i < string.length; i++) {
			count[i] = 1;
			for(int j = i + 1; j < string.length; j++) {
				if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					count[i]++;
					string[j] = '0';
				}
			}
		}
		int max = count[0];
		for(int i = 0; i < count.length; i++) {
			if(max < count[i]) {
				max = count[i];	
				maxChar = string[i];
			}
		}
		return maxChar;
		
	}
	public static char minCharacter(String str) {
		int[] count = new int[str.length()];
		char[] string = str.toCharArray();
		char minChar = str.charAt(0);
		for(int i = 0; i < string.length; i++) {
			count[i] = 1;
			for(int j = i + 1; j < string.length; j++) {
				if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {
					count[i]++;
					string[j] = '0';
				}
			}
		}
		int min = count[0];
		for(int i = 0; i < count.length; i++) {
			if(min > count[i]) {
				min = count[i];	
				minChar = string[i];
			}
		}
		return minChar;
		
	}

}
