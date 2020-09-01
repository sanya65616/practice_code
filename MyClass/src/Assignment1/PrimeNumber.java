package Assignment1;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		int n, count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number");
		n = scan.nextInt();
		for(int i = 2; i <= n/2; i++) {
			if(n % i == 0)
				count++;
		}
		if(count == 0)
			System.out.print(n + " is a prime number");
		else
			System.out.print(n + " is not a prime number");
	}

}
