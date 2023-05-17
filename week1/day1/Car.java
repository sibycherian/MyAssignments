package week1.day1;

public class Car {

	//Accessmodifier Returntype Methodname(input args)
	
		//noofWheel
		public void noOfWheel() {
			System.out.println("noOfWheel : 4");
		}
		
		public void color() {
			// TODO Auto-generated method stub
			System.out.println("Red");
		}
		
		public int modelNo() {
			// TODO Auto-generated method stub
			return 234;
		}
		
		public String brandName() {
			// TODO Auto-generated method stub
			return "BMW";		
		}
		

		public static void main(String[] args) {
			Car c=new Car();
			c.noOfWheel();
			c.color();
			System.out.println(c.brandName());
			int modelNo=c.modelNo();
					System.out.println(modelNo);
		}
		
	}

