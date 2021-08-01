package Assignment5;

import java.util.Scanner;

class ArrayCl{
	int arr[];
	ArrayCl(int arr[]){
		this.arr = arr;
	}
	public void disp() {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	public void rotateRight(int numberOfRotation) {
		
		for(int j = 0; j < numberOfRotation; j++) {
			int temp = arr[arr.length-1];
			for(int i = arr.length - 1; i > 0; i--) {
				arr[i] = arr[i-1];
			}
			arr[0] = temp;
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
	
public class ArrayRotate {
	public static void main(String[] args) {
		int[] a; // = {54,87,65,1,54,58,24,87,65,48};
		a = new int[10];
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the elements of array");
		for(int i = 0; i < a.length; i++) {
			a[i] = scan.nextInt();
		}
		ArrayCl arr = new ArrayCl(a);
		arr.disp();
		System.out.println("Enter number of rotation: ");
		int n = scan.nextInt();
		arr.rotateRight(n);
	}

}


