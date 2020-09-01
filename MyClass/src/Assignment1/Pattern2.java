package Assignment1;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		System.out.print("Enter the number of rows:");
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < i; j++)
				System.out.print(" ");
			for(int j = 0; j < row-i; j++) 
				System.out.print("* ");
			System.out.println();
		}
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < row-i-1; j++)
				System.out.print(" ");
			for(int j = 0; j < i+1; j++)
				System.out.print("* ");
			System.out.println();
		}
	}

}
