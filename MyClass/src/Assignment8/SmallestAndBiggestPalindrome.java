package Assignment8;

import java.util.Scanner;

public class SmallestAndBiggestPalindrome {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str1 = scan.nextLine();
		String[] words1 = str1.split(" ");
		String[] words2 = new String[words1.length];
		for(int i = 0; i < words1.length; i++) {
			StringBuffer temp1 = new StringBuffer(words1[i]);
			StringBuffer temp2 = temp1.reverse();
			words2[i] = temp2.toString();
		}
		System.out.println("Before reverse: ");
		for(int i = 0; i < words1.length; i++) {
			System.out.print(words1[i] + ", ");
		}
		System.out.println();
		System.out.println("After reverse: ");
		for(int i = 0; i < words2.length; i++) {
			System.out.print(words2[i] + ", ");
		}
		System.out.println();
		int[] count = new int[words1.length];
		for(int i = 0; i < words2.length; i++) {
			if(words1[i].equals(words2[i])) {
				count[i] = words1[i].length();
			}
		}
		int min = count[0];
		String small = words1[0];
		for(int i = 0; i < words1.length; i++){
			if(min > count[i]) {
				min = count[i];
				small = words1[i];
			}
		}
		System.out.println("Smallest palindrome: " + small);
		int max = count[0];
		String big = words1[0];
		for(int i = 0; i < words1.length; i++){
			if(max < count[i]) {
				max = count[i];
				big = words1[i];
			}
		}
		System.out.println("Biggest palindrome: "+ big);
	}
}
