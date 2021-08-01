package Assignment9;

import java.util.Scanner;

public class JarOfCandies {
	public static void main(String[] args) {
		final int N = 10;
		final int K = 3;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int left = N-n;
		if(n > 0 && n <= N-K) {
			System.out.println("NUMBER OF CANDIES SOLD: " + n);	
		}
		else {
			System.out.println("INVALID INPUT");
			
		}
		if(left <= K) {
			left = left + (N-left);
			System.out.println("NUMBER OF CANDIES AVAILABLE: " + left);
		}
		else
			System.out.println("NUMBER OF CANDIES AVAILABLE: " + left);
	}	
}
