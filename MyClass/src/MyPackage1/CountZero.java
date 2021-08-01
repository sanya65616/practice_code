
//Find the no. Of zeros  in a factorial of a number
//where 1<=N<=10^9
package MyPackage1;

import java.util.Scanner;

public class CountZero {
	public static int findNumberOfZeros(int n){
		int count = 0;
		for(int i=1; i<=n; i++) {
//			System.out.println(i);
			count += countFiveAsFactor(i);
		}
		
		return count;	
	}
	static int countFiveAsFactor(int n) {
		int count = 0;
		while(n > 4) {
			if(n % 5 == 0) {
				count++;
				n = n / 5;
			}
			else {
				return count;
			}
			
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		System.out.println(findNumberOfZeros(a));
	}
}
