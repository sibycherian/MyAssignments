package week1.day2;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int fact=1;
		for (int i=n; i>=1;i--) {
			fact=fact*i;
		}
System.out.println("Factorial of the given number "+n+" is : "+fact);
	}
	
	/*public static void main(String[] args) {
	// TODO Auto-generated method stub
	int n=5;
	int fact=1;
	for (int i=1; i<=n;i++) {
		fact=fact*i;
	}
System.out.println(fact);
}*/

}
