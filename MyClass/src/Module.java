import java.util.Scanner;

public class Module {
	

		private static Scanner scan;

		public static void main(String[] args) {
			float a;
			int b,c;
			 scan = new Scanner(System.in);
			a = scan.nextFloat();
			b = scan.nextInt();
			c = (int)(a%b);
			System.out.print(c);
		}

}
