package Assignment10;

import java.util.Scanner;

public class NthTermInSeries {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long number;
		if(n%2 == 0) {
			number = getPrime(n/2);
		}
		else {
			number = getFibonacci((n+1)/2);
		}
		System.out.println(number);
		scan.close();
		//System.out.println(getPrime(4));
		//System.out.println(getFibonacci(5));
		
	}

	private static long getFibonacci(int n) {
		// TODO Auto-generated method stub
		int count = 0, fibonacci = 0;
		if(n < 1) {
			return 0;
		}
		if(n==1 || n==2) {
			return 1;
		}
		else {
			int a = 1, b = 1;
			count = 2;
			while(count < n) {
				fibonacci = a + b;
				count++;
				a = b;
				b = fibonacci;
			}
		}
	
		return fibonacci;
	}

	private static long getPrime(int n) {
		int count = 0;
		long prime = 0;
		long i = 2;
		while(count<n) {
			if(isPrime(i)) {
				count++;
				prime = i;
			}
			i++;
		}
		return prime;
	}

	private static boolean isPrime(long i) {
		if(i<2) {
			return false;
		}
		for(int j = 2 ; j <= i/2 ; j++) {
			if(i % j == 0) {
				return false;
			}
		}
		return true;
	}

}
