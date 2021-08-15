package week1.day2;

public class FindTypes {

	public static void main(String[] args) {
		String test = "$$ Welcome to 2nd Class of Automation $$ ";

		// Here is what the count you need to find
		int  letter = 0, space = 0, num = 0, specialChar = 0;
		char[] arr=test.toCharArray();
		for (int i=0;i<arr.length;i++) {
			if (Character.isLetter(arr[i])) {
				letter=letter+1;
			}
			else if(Character.isSpaceChar(arr[i])) {
				space=space+1;
			}
			else if(Character.isDigit(arr[i])) {
				num=num+1;
			}
			else {
				specialChar = specialChar + 1;
			}
		}
		System.out.println("The number of letters are " +letter);
		System.out.println("The number of Digits are " +num);
		System.out.println("The number of space are " +space);
		System.out.println("The number of special are " +specialChar);
		

	}

}
