package Assignment8;

import java.util.Scanner;

public class NumberOfWords {
	public static void main(String[] agrs) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any string:");
		String str = scan.nextLine();
		System.out.println("Number of words: " + numberOfWord(str)); 
	}
	public static int numberOfWord(String str) {
		String[] words = str.split(" ");
		return words.length;
	}

}
