package Assignment6;

public class FrequencyOfOddEven {
	public static void main(String[] args) {
		int countEven = 0, countOdd = 0;
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
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(a[i][j] % 2 == 0) {
					countEven++;
				}
				if(a[i][j] % 2 != 0) {
					countOdd++;
				}
			}
		}
		System.out.println("Frequency of odd number in a matrix is: " + countOdd);
		System.out.println("Frequency of even number in a matrix is: " + countEven);
	}
}
