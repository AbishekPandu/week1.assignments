package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="stops";
		String str2="potss";
		int count=0;
		if (str1.length()==str2.length()) {
			System.out.println("The length are equals");
		}
		char [] test1= str1.toCharArray();
		char [] test2=str2.toCharArray();
		Arrays.sort(test1);
		Arrays.sort(test2);
		for (int i=0;i<test1.length;i++) {
			if(test1[i]!=test2[i]) {
				System.out.println("The given strings are not anagram");
				break;
				
			}
			
		}
		

	}

}
