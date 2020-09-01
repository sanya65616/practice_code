package Assignment1;

	import java.util.Scanner;

	public class FactorialNumber {
	   private Scanner scan;
	public void main(String[] args) {
		   scan = new Scanner(System.in);
		   System.out.println("Enter any number:");
		   int n = scan.nextInt();
		   int fact = findFactorial(n);
		   System.out.println("Factorial of "+ n +"is " + fact);
	   }
	   public int findFactorial(int n) {
		      if(n <= 1)
			    return 0;
		      else
			    return findFactorial(n)*findFactorial(n-1);
	       
	   }
	}   
	  


