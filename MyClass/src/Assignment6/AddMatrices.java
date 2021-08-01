package Assignment6;

public class AddMatrices {
	
	public static void main(String[] args) {
		int a[][] = {{6, 9, 57, 98},
				 {77, 23, 4, 2},
				 {78, 23, 12, 3}
				};
		int b[][] = {{2, 44, 21, 4},
					 {33, 12, 7, 23},
					 {21, 2, 14, 32}
					};
		int c[][] = new int[3][4];
		
		for(int i= 0; i < 3; i++) {
			for(int j = 0; j < 4; j++) {
				c[i][j] = a[i][j] + b[i][j];
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}

