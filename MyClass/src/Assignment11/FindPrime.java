package Assignment11;

import java.util.Scanner;

public class FindPrime {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		check(num);
	}
	
	public static void check(int n) {
		boolean checkPrime = false;
		if(n < 0)
			System.out.println(n);
		else {
			checkPrime = prime(n);
			if(checkPrime == true)
				System.out.println(n + " is a Prime Number");
			else
				System.out.println(n + " is not a Prime Number");
		}
		
	}
	
	public static boolean prime(int n) {
		if(n < 2)
			return false;
		else {
			for(int i = 2 ; i <= n/2 ; i++) {
				if(n % i == 0) {
					return false;
				}
			}
			return true;
		}
	}

}
