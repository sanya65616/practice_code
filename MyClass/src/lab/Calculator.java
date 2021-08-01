package lab;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		char c = scan.next().charAt(0);
		
		switch(c) {
			case '+' : System.out.println(a+b);
						break;
			case '-' : System.out.println(a-b);
						break;
			case '*' : System.out.println(a*b);
						break;
			case '/' : System.out.println(a/b);
						break;
			default : System.out.println("Invalid input");
		}
	}

}
