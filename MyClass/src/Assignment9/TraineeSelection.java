package Assignment9;

import java.util.Scanner;

public class TraineeSelection {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int r1t1 = scan.nextInt();
		int r1t2 = scan.nextInt();
		int r1t3 = scan.nextInt();
		int r2t1 = scan.nextInt();
		int r2t2 = scan.nextInt();
		int r2t3 = scan.nextInt();
		int r3t1 = scan.nextInt();
		int r3t2 = scan.nextInt();
		int r3t3 = scan.nextInt();
		int average1 = 0, average2 = 0, average3 = 0;
		if(r1t1 > 1 && r1t1 < 100 && r2t1 > 1 && r2t1 < 100 && r3t1 > 1 && r3t1 < 100 && r1t2 > 1 &&
				r1t2 < 100 && r2t2 > 1 && r2t2 < 100 && r3t2 > 1 && r3t2 < 100 &&
				r1t3 > 1 && r1t3 < 100 && r2t3 > 1 && r2t3 < 100 && r3t3 > 1 && r3t3 < 100) {
			average1  = (r1t1 + r2t1 + r3t1) / 3;
			average2 = (r1t2 + r2t2 + r3t2) / 3;
			average3 = (r1t3 + r2t3 + r3t3) / 3;
		}
		else
			System.out.println("INVALID INPUT");
		if(average1 < 70 && average2 < 70 && average3 < 70)
			System.out.println("All trainees are unfit");
		else {
			if(average1 > average2) {
				if(average1 > average3)
					System.out.println("Trainee Number : 1");
				else if(average1 == average3) {
					System.out.println("Trainee Number : 1");
					System.out.println("Trainee Number : 3");
				}
				else
					System.out.println("Trainee Number : 3");
			}
			else if(average1 == average2) {
				if(average1 > average3) {
					System.out.println("Trainee Number : 1");
					System.out.println("Trainee Number : 2");
				}
				else
					System.out.println("Trainee Number : 3");
			}
			else {
				if(average2 > average3)
					System.out.println("Trainee Number : 2");
				else if(average2 == average3) {
					System.out.println("Trainee Number : 2");
					System.out.println("Trainee Number : 3");
				}
				else
					System.out.println("Trainee Number : 3");
			}
		}
		
	}
}
