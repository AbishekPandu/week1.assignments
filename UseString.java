package week1.day2;

public class UseString {

	public static void main(String[] args) {
		// Initialize a string
		// 2 ways:
		// -- literals
		// -- new keyword

		String str = "Welcome-To-Testleaf";

		// Welcome To Testleaf
		String[] splitStr = str.split("-");
		int size= str.length();

		for (int i = 0; i < splitStr.length; i++) {
			System.out.println("splitStr[" + i + "]: " + splitStr[i]);
			
		}
		System.out.println("The length of sting is "+size );
	}
	
}