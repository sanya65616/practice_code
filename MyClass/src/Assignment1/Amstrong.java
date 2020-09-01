package Assignment1;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number:");
		int n = scan.nextInt();
		int sum = 0;
		for(int i = n; i > 0; i = i / 10) {
			int digit = i % 10;
			
			sum = (int) (sum + Math.pow(digit, 3));
		}
		if(n == sum)
			System.out.print(n + " is a Amstrong Number");
		else
			System.out.print(n + " is not a Amstrong Number");
	}

}
