package Assignment6;

public class LowerTriangularMatrix {
	public static void main(String[] args) {
		int[][] a = {{1, 0, 0, 0},
		             {5, 8, 0, 0},
		             {3, 7, 1, 0},
		             {9, 2, 1, 5}
		            };
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

}
