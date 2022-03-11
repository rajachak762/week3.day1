package week3.day1;

public class AxisBank extends BankInfo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AxisBank aa = new AxisBank();
		aa.deposit();
		aa.fixed();

	}
	
	public void deposit() {
		System.out.println(" This is the overidden method for deposit");
	}

}
