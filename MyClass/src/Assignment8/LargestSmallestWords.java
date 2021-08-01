package Assignment8;

import java.util.Scanner;

public class LargestSmallestWords {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string:");
		String str = scan.nextLine();
		System.out.println("Largest word: " + largestWord(str)); 
		System.out.println("Smallest word: " + smallestWord(str));
	}
	public static String largestWord(String str) {
		String[] words = str.split(" ");
		int[] count = new int[words.length];
		for(int i = 0; i < words.length; i++) {
			String word = words[i];
			count[i] = word.length();
			}
		
		int max = count[0];
		String maxWord = words[0];
		for(int i = 0; i < count.length; i++) {
			if(max < count[i]) {
				max = count[i];	
				maxWord = words[i];
			}
		}
		return maxWord;
	}
	public static String smallestWord(String str) {
		String[] words = str.split(" ");
		int[] count = new int[words.length];
		for(int i = 0; i < words.length; i++) {
			String word = words[i];
			count[i] = word.length();
			}
		
		int min = count[0];
		String minWord = words[0];
		for(int i = 0; i < count.length; i++) {
			if(min > count[i]) {
				min = count[i];	
				minWord = words[i];
			}
		}
		return minWord;
	}
}
