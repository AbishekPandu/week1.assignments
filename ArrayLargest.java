package week1.day2;

import java.util.Arrays;

public class ArrayLargest {

	public static void main(String[] args) {
		
		int arrnum[]= {34,203,5,78,100,1000,1};
		System.out.println(arrnum.length);
		// TODO Auto-generated method stub
		Arrays.sort(arrnum);
		System.out.println("The second largest number in array is:" + arrnum[arrnum.length-2]);

	}

}
