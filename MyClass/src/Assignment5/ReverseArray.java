package Assignment5;

import java.util.Scanner;

public class ReverseArray {
	
	public static void main(String[] args) {
		int arr[];
		arr = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements of array");
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("Array in reverse:");
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.print(arr[i]+ " ");
		}
	}

}
