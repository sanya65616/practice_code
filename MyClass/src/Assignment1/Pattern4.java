package Assignment1;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		System.out.print("Enter the number of row:");
		Scanner scan = new Scanner(System.in);
		int row = scan.nextInt();
		
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= i-1; j++)
				System.out.print(" ");
			for(int j = i; j <= row; j++)
				System.out.print(j+" ");
			System.out.println();
		}
		
		for(int i = row-1; i >= 1; i--) {
			for(int j = 1; j <= i-1; j++)
				System.out.print(" ");
			for(int j = i; j <= row; j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}

}
