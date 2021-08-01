package Assignment6;

public class TransposeMatrix {
	public static void main(String[] args) {
		int x = 0;
		int[][] a = {{1, 43, 21, 88},
		             {5, 8, 23, 56},
		             {3, 7, 4, 12},
		             {9, 2, 1, 5}
		            };
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("Transpose Matrix: ");
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(a[j][i]+ " ");
			}
			System.out.println();
		}
	}
}
