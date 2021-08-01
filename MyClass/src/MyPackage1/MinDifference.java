
//Find the minimum difference between the  each elements of an array
package MyPackage1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class MinDifference {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        List<Integer> array1 = ArrayList<>();
//        int[] arr2 = new int[6];
//        for(int i = 0; i < arr1.length; i++)
//        arr1[i] = scan.nextInt();
//        for(int i = 0; i < arr1.length; i++) {
//        	int count = 0;
//        	for(int j = 0; j < arr1.length; j++) { 
//        		if(arr1[i] > arr1[j])
//    				count++;
//        	}
//        	arr2[i] = count;
//        }
//        for(int i = 0; i < arr2.length; i++)
//        	System.out.print(arr2[i] + " ");
//        
     Character[] arr = new Character[21];
     int count = 0;
  //    int[] arr2 = new int[8];
        Map<Character, Integer> list = new HashMap<>();
      for(int i = 0; i < arr.length; i++)
    	  arr[i] = scan.next().charAt(0);
//      for(int i = 0; i < list.size(); i++) {
//    	  int count = 1;
//    	  for(int j = i+1; j < list.size(); j++) {
//    		  if(list.containsKey(arr[i]))
//    			  break;
//    		  else {
//    			  if(arr[i] == arr[j])
//    			  count++;
//    		  }
//    	  }
//    	  list.put(arr[i], count);
//      }
      
      for(int key : arr) {
    	  list.put((char) key, list.getOrDefault(key, 0) + 1);
      }
      
     // int minKey = Integer.MAX_VALUE, minValue = Integer.MAX_VALUE;
      for(Map.Entry<Character, Integer> entry : list.entrySet()) {
    	  if(entry.getValue() == 1) {
    		count++;
      }
     
    }
      System.out.println(count);
}
}
