package Assignment8;

import java.util.Scanner;

public class MostRepeatedWord {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string:");
		String str = scan.nextLine();
		mostRepeatedWord(str); 
	}
	public static void mostRepeatedWord(String str) {
		str = str.toLowerCase();
		String[] words = str.split(" ");
		int[] count = new int[words.length];
		for(int i = 0; i < words.length; i++) {
			count[i] = 1;
			for(int j = i + 1; j < words.length; j++) {
				if(words[i].equals(words[j])) {
					count[i]++;
				}
			}
		}
		int max = count[0];
		String maxWord = words[0];
		for(int i = 0; i < count.length; i++) {
			if(max < count[i]) {
				max = count[i];
				maxWord = words[i];
			}
		}
		System.out.println("Most repeated word: " +maxWord);
	}

}
