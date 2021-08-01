package Assignment7;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramStrings {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st string: ");
		String str1 = scan.next();
		System.out.println("Enter 2nd string: ");
		String str2 = scan.next();
		char[] arr1 = str1.toCharArray();
		Arrays.sort(arr1);
		char[] arr2 = str2.toCharArray();
		Arrays.sort(arr2);
		if(arr1.length == arr2.length) {
			
//			boolean check = String.valueOf(arr1).equals(new String(arr2));
			boolean check = Arrays.equals(arr1, arr2);
			if(check == true) {
				System.out.println("Two strings are anagram.");
			}
		}
		else
			System.out.println("Two strings are not anagram.");
		
	}
}
