package week3.day2;

public class AxisBank extends BankInfo{

	public void deposit() {
		System.out.println("Deposit in Axis Bank");
	}
	
	public static void main(String[] args) {
		AxisBank a = new AxisBank();
		a.deposit();
	}
}
