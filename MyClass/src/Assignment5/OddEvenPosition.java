package Assignment5;

import java.util.Scanner;

class Array{
	int arr[];
	Array(int arr[]){
		this.arr = arr;
	}
	public void disp() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public void evenPosition() {
		System.out.print("Even position elements:");
		for(int i = 0 ; i < arr.length; i=i+2) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	public void oddPosition() {
		System.out.print("Odd position elements:");
		for(int i = 1 ; i < arr.length; i=i+2) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
}

public class OddEvenPosition {
	public static void main(String[] args) {
		int a[];
		a = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements of array");
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		Array arr = new Array(a);
		arr.disp();
		arr.evenPosition();
		arr.oddPosition();
	}

}
