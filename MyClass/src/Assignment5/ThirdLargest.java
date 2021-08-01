package Assignment5;

import java.util.Scanner;

class ArrayCl2{
	int arr[];
	ArrayCl2(int arr[]){
		this.arr = arr;
	}
	public void disp() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public void thirdLargestNumber() {
		int first, second, third;
		first = second = third = Integer.MIN_VALUE;
		if(arr.length < 3) {
			System.out.println("Invalid Input");
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > first) {
				third = second;
				second = first;
				first = arr[i];
			}
			else if(arr[i] > second && arr[i] != first) {
				third = second;
				second = arr[i];
			}
			else if(arr[i] > third && arr[i] != second) {
				third = arr[i];
			}
		}
		System.out.println("Third Largest Number in array: " + third);
	}
}

public class ThirdLargest {
	public static void main(String[] args) {
		int a[];
		a = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements of array");
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		ArrayCl2 arr = new ArrayCl2(a);
		arr.disp();
		arr.thirdLargestNumber();
	}

}
