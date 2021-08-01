package Assignment11;

import java.util.Scanner;

public class FinalPosition {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int steps = scanner.nextInt();
		int stepCount = 0;
		int x=0,y=0;
		while(steps > 0) {
			switch(stepCount % 5 + 1) {
				case 1:
					x += ++stepCount * 10;
					break;
				case 2:
					y += ++stepCount * 10;
					break;
				case 3:
					x -= ++stepCount * 10;
					break;
				case 4:
					y -= ++stepCount * 10;
					break;
				case 5:
					x += ++stepCount * 10;
					break;
			}
			steps--;
		}
		System.out.println(x + " " + y);
	}

}
