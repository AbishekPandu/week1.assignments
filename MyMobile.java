package week1.day2;

public class MyMobile {
	int price1=4000;
	public void makeCall()
	{
		System.out.println("Call me");
	}
	public void sendMsg()
	{
		System.out.println("Send msg");
	}
	private int payBill()
	{
		int x=0;
		System.out.println("Pay my bill");
		return x;
	}

	public static void main(String[] args) {
		MyMobile mobj=new MyMobile();
		mobj.sendMsg();
		mobj.makeCall();
		mobj.payBill();
		 int price = mobj.price1;
		 System.out.println("THHH"+price);
		 System.out.println(mobj.payBill());
		// TODO Auto-generated method stub

	}

}
