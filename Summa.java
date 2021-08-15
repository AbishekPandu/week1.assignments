package week1.day2;

public class Summa {

	int a = 10, b = 10;
	int c = 2;
	int d;
	
public int addition(){ 
	a=b+c; 
	return a; 
	}

public void addition2(){ 
	System.out.println(a); 
	}


	public static void main(String[] args) {

		Summa s = new Summa();
		s.addition();
		//s.addition2();
		int add = s.a;
		//s.d = s.c + s.b;
		//System.out.println(s.d);
		System.out.println(add);
		// TODO Auto-generated method stub

	}

}
