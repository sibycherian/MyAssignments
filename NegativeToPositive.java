package week1.day2;

public class NegativeToPositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=-40;
		if(num < 0) {
			System.out.println("The given number is negative");
			num=(-num);
		}
		System.out.println("The number converted to positive is : "+num);
	}

}
