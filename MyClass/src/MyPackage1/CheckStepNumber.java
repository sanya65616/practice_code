package MyPackage1;

import java.util.Scanner;

public class CheckStepNumber {
	static int num;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		if(check(num)) {
			System.out.println(num + " is Step Number");
		}
		else
			System.out.println(num + " is not a Step Number");
	}
	private static boolean check(int n) {
		// TODO Auto-generated method stub
		int previousValue = n % 10;
		n = n / 10;
		while(n > 0) {
			int currentValue = n % 10;
			n = n / 10;
			if(currentValue - previousValue != 1 && currentValue - previousValue != -1) 
				return false;
			previousValue = currentValue;
		}
		return true;
		
		
	}
}
