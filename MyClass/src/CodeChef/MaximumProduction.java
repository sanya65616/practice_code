package CodeChef;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MaximumProduction {	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no.");
		int number = scan.nextInt();
		int r = find(number);
		System.out.println("Largest number is: " + r);
	}
	
	private static int find(int number) {
		int arr[] = new int[100];
		int count = 0;
		while(number != 0) {
			int rem = number % 100;
			arr[count] = rem;
			count++;
			number = number/10;
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scanner;
		return arr[arr.length-1];
	}
	
}


