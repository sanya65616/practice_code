package Assignment6;

public class SumOfRowColumn {
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
		
		for(int i = 0; i < 4; i++, x++) {
			int j, sum = 0;
			for(j = 0; j < 4; j++) {
				
				sum = sum + a[i][j];
			}
			System.out.println("Sum of "+ x +"th row is: "+ sum);
		}
		System.out.println();
		int y = 0;
		for(int i = 0; i < 4; i++, y++) {
			int j, sum = 0;
			for(j = 0; j < 4; j++) {
				
				sum = sum + a[j][i];
			}
			System.out.println("Sum of "+ y +"th column is: "+ sum);
		}
	}
}
