package lab;

import java.util.Scanner;

public class WeekDay {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter number: ");
		int num = scan.nextInt();
		System.out.println(getDayName(num));	
	}

	private static String getDayName(int num) {
		// TODO Auto-generated method stub
		String dayName = "";
		switch (num) {
			case 1: dayName ="Monday";
					break;
			case 2: dayName ="Tuesday";
					break;
			case 3: dayName ="Wednesday";
					break;
			case 4: dayName ="Thursday";
					break;
			case 5: dayName ="Friday";
					break;
			case 6: dayName ="Saturday";
					break;
			case 7: dayName ="Sunday";
					break;
			default :dayName ="Invalid day range";
		}
		return dayName;
	}

}
