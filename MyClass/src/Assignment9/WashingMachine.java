package Assignment9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class WashingMachine {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
			try {
				int weight = scan.nextInt();
				if(weight > 0 && weight <= 2000)
				System.out.println("Time Estimate: 25 minutes");
				else if(weight > 2000 && weight <= 4000)
					System.out.println("Time Estimate: 35 minutes");
				else if(weight > 4000 && weight <= 7000)
					System.out.println("Time Estimate: 45 minutes");
				else if(weight == 0)
					System.out.println("Time Estimate: 0 minutes");
				else if(weight > 7000)
					System.out.println("OVERLOADED");
				else
					throw new NumberFormatException();
				scan.close();
		}
		catch(NumberFormatException e) {
			System.out.println("INVALID INPUT");
		}
		catch(InputMismatchException e) {
			System.out.println("INVALID INPUT");
		}
	}

}
