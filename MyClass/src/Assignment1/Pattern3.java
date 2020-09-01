package Assignment1;

import java.util.Scanner;

public class Pattern3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the number of rows you want to print:");
		int row = scan.nextInt();
		for(int i = 1; i <= row; i++) {
			for(int j = 1; j <= row-i; j++)
				System.out.print(" ");
			System.out.print("*");
			for(int j = 1; j <= (2*(i-2)+1); j++)
				System.out.print(" ");
			if(i != 1) 
				System.out.print("*");
			System.out.println();
			
		}
		
		for(int i = 1; i <= row-1; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print(" ");
			System.out.print("*");
			for(int j = 1; j <= (2*(row-2-i)+1); j++)
				System.out.print(" ");
			if(i != row-1)
				System.out.print("*");
			System.out.println();
		}
	}

}
