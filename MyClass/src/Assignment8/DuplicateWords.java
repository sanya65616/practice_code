package Assignment8;

import java.util.Scanner;

public class DuplicateWords {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string:");
		String str = scan.nextLine();
		duplicateWord(str); 
	}
	public static void duplicateWord(String str) {
		str = str.toLowerCase();
		String[] words = str.split(" ");
		int[] count = new int[words.length];
		for(int i = 0; i < words.length; i++) {
			count[i] = 1;
			for(int j = i + 1; j < words.length; j++) {
				if(words[i].equals(words[j])) {
					count[i]++;
					words[j] = "0";
				}
			}
			if(count[i] > 1 && words[i] != "0")
			System.out.println(words[i]);
		}
	}

}
