package Assignment5;

import java.util.Scanner;

class ArrayCl1{
	int arr[];
	ArrayCl1(int arr[]){
		this.arr = arr;
	}
	public void disp() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public void sort() {
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length - 1; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		System.out.print("Sorted Array: ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

public class SortArray {
	public static void main(String[] args) {
		int a[];
		a = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements of array");
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		ArrayCl1 arr = new ArrayCl1(a);
		arr.disp();
		arr.sort();
	}

}
