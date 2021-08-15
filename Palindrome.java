package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		String str="madam";
		//System.out.println(str);
		String rev="";
		int length= str.length() - 1;
		System.out.println(length);
		for (int i=length; i>=0; i--) {
			rev= rev + str.charAt(i);	
			 System.out.println(rev);
		}
		if (str.equals(rev)) {
			System.out.println("The given string is a palindrome");
		}
		else {
			System.out.println("The given string is not a palindrome");
		}
		

	}

}
