package Assignment7;

import java.lang.String;

public class SortString {
	public static void main(String[] args) {
		String[] str = {"Durgapur", "Pune", "Banglore", "Bokaro", "Patna", "Hydrabad", "Delhi"};
		System.out.println("String before sorting: ");
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		for(int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {
				if(str[i].compareTo(str[j]) > 0) {
					String temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
				
			}
		}
		System.out.println("\nString after sorting: ");
		for(int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
	}
}
