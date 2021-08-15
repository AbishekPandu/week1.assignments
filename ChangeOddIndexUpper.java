package week1.day2;

public class ChangeOddIndexUpper {

	public static void main(String[] args) {
		String test="changeme";
	char[] arr=	test.toCharArray();
	//System.out.println(arr.length);
	for (int i=0;i<arr.length;i++) {
		if (i%2!=0) {
			arr[i]=Character.toUpperCase(arr[i]);
		}
		System.out.println("The string after change: " +arr[i]);
	}
	
	}

}
