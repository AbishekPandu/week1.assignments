package week1.day2;

public class CharOccurance {

	public static void main(String[] args) {
		String str="welcome to chennai";
		int var=0;
		char[] arr =str.toCharArray();
		int length=arr.length;
		for ( int i=0;i<length;i++) {
			for (int j=i+1;j<length;j++) {
				if (arr[i]==arr[j]) {
					var=var+1;
				}
			}
			
			
		}
		System.out.println("The no. of duplicates in the string are :" +var);
		// TODO Auto-generated method stub

	}

}
