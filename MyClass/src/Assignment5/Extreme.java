package Assignment5;

import java.util.Scanner;

class ArrayClass{
	int arr[];
	ArrayClass(int arr[]){
		this.arr = arr;
	}
	public void disp() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public void largestNumber() {
		System.out.print("Largest element:");
		 int max = arr[0];
		for(int i = 1 ; i < arr.length; i++) {
				if(max < arr[i]) {
					max = arr[i];
			}
		}
		System.out.print(max);
		System.out.println();
	}
	
	public void smallestNumber() {
		System.out.print("Smallest element:");
		int min = arr[0];
		for(int i = 1 ; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.print(min);
		System.out.println();
	}
	public void findMinMax() {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}	
		}
		System.out.println("largest number: "+max);
		System.out.println("Smallest number: "+min);
	}
}


public class Extreme {
	
	public static void main(String[] args) {
		int a[];
		a = new int[10];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the elements of array");
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		ArrayClass arr = new ArrayClass(a);
		arr.disp();
		//arr.largestNumber();
		//arr.smallestNumber();
		arr.findMinMax();
	}

}


