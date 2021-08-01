package Assignment6;

import java.util.Scanner;

public class CheckEqualMatrices {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = 0;
		System.out.println("Enter the number row of matrices: ");
		int rows = scan.nextInt();
		System.out.println("Enter the number column of matrices: ");
		int columns = scan.nextInt();
		int a[][] = new int[rows][columns];
		System.out.println("Enter element of 1st array: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				a[i][j] = scan.nextInt();
			}
		}
	
		int b[][] = new int[rows][columns];
		System.out.println("Enter element of 2nd array: ");
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				b[i][j] = scan.nextInt();
			}
		}
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < columns; j++) {
				if(a[i][j] != b[i][j]) {
					count++;
				}
			}
		}
		if(count == 0) {
			System.out.println("Two matrices are equal");
		}
		else
			System.out.println("Two matrices are not equal");
	}

}
