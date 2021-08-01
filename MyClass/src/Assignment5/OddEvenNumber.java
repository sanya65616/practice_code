package Assignment5;

import java.util.Scanner;

class ArrayClass1{
	int arr[];
	ArrayClass1(int arr[]){
		this.arr = arr;
	}
	public void disp() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public void oddNumber() {
		System.out.print("Odd Numbers: ");
		for(int i= 0; i < arr.length; i++) {
			if(arr[i] % 2 != 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
	public void evenNumber() {
		System.out.print("Even Numbers: ");
		for(int i= 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				System.out.print(arr[i] + " ");
			}
		}
		System.out.println();
	}
	
}

public class OddEvenNumber {
	public static void main(String[] args) {
		int a[];
		a = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements of array");
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		ArrayClass1 arr = new ArrayClass1(a);
		arr.disp();
		arr.oddNumber();
		arr.evenNumber();
	}


}
