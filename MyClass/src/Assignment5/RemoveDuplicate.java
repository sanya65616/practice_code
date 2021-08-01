package Assignment5;

import java.util.Scanner;

class ArrayCl3{
	int arr[];
	ArrayCl3(int arr[]){
		this.arr = arr;
	}
	public void disp() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public void removeDuplicate() {
		int size = 1;
		for(int i=1; i<arr.length; i++) {
			int j = 0;
			for(; j < size; j++) {
				if(arr[i] == arr[j]) {
					break;
				}
			}
			if(j==size) {
				arr[size] = arr[i];
				size++;
			}
		}
		// 1 3 1 4 1
		for(int i = 0; i < size; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}

public class RemoveDuplicate {
	public static void main(String[] args) {
		int a[];
		a = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements of array");
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		ArrayCl3 arr = new ArrayCl3(a);
		arr.disp();
		arr.removeDuplicate();
	}

}
