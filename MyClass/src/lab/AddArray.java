package lab;

public class AddArray {
	public static int add(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return sum;	
	}
	public static void main(String[] args) {
		int[] array = {2,6,4,8,1,5,2};
		System.out.println(add(array));
	}

}
