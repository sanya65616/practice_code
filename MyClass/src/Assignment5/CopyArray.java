package Assignment5;

public class CopyArray {
	public static void main(String[] srgs) {
		int a1[]= {3,7,24,85,11,5,90};
		int a2[];
		a2 = new int[10];
		a2 = a1;
		for(int i = 0; i < a2.length; i++) {
			System.out.print(a2[i]+" " );
		}
	}

}
