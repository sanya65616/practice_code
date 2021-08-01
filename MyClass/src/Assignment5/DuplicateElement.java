package Assignment5;

import java.util.Scanner;

public class DuplicateElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
			System.out.println("Enter the size of numbers: ");
			int numberCount = scan.nextInt();
			int[] arr = new int[numberCount];
			System.out.println("Enter elements of an array:");
			for(int i = 0; i < arr.length; i++) {
				arr[i] = scan.nextInt();
			}
	
		int size = 1;
		for(int i=1; i<arr.length; i++) {
			int j = 0;
			for(; j < size; j++) {
				if(arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
					break;
				}
			}
			if(j==size) {
				arr[size] = arr[i];
				size++;
			}
		}
		System.out.println();
	}
}

