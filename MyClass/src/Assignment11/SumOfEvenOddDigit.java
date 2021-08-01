package Assignment11;

import java.util.Scanner;

public class SumOfEvenOddDigit {
	static Scanner scan = new Scanner(System.in);
	static long num = scan.nextLong();
	
	public static void main(String[] args) {
		long even = addEven(num);
		long odd = addOdd(num);
		long result = odd - even;
		System.out.println(result);
	}
	
	public static long addEven(long n) {
		int i = 1;
		long sum = 0;
		
		while(n > 0) {
			long rem = n % 10;
			if(i % 2 == 0) {
				sum = sum + rem;
				//System.out.println("Even: " + i + " " + rem);
			} 
			n = n / 10;
			i++;
		}
		return sum;
		
	}
	
	public static long addOdd(long n) {
		int i = 1;
		long sum = 0;
		
		while(n > 0) {
			long rem = n % 10;
			if(i % 2 != 0) {
				sum = sum + rem;
				//System.out.println("Odd: " + i + " " + rem);
			} 
			n = n / 10;
			i++;
		}
		return sum;
		
	}

}
