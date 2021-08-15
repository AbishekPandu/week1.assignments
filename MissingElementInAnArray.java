package week1.day2;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] arr = {0,1,2,3,4,7,6,8};
		Arrays.sort(arr);
		//System.out.println(arr[arr.length-1]);
		// TODO Auto-generated method stub
		for(int i=0; i<arr.length; i++) {
			if (arr[i] != i) {
				System.out.println("The missing number is " +i);
				break;
				
			}
			
		}

	}

}
