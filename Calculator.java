package week1.day2;

public class Calculator {
	int sum;
	int sub;
	double div;
	int mul;
public int add(int num1, int num2, int num3){
	sum = num1 + num2 + num3;
	System.out.println(sum);
	return sum;	
}
public int sub(int num1, int num2) {
	sub=num1-num2;
	System.out.println(sub);
	return sub;
}
public double div( double num1, double num2) {
	div=num1/num2;
	System.out.println(div);
	return div;
}
public int mul(int num1,int num2) {
	mul=num1*num2;
	System.out.println(mul);
	return mul;
}
}



