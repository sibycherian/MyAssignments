package week3.day2;

public class Students {
	
	public void getStudentInfo(int id) {
		System.out.println("Student id :"+id);
	}
	
	public void getStudentInfo(int id, String name) {
		System.out.println("Student id & name :"+id +name);
	}

	public void getStudentInfo(String email, int phNo) {
		System.out.println("Student email & phno :"+email +phNo);
	}
	
	public static void main(String[] args) {
		
		Students s = new Students();
		s.getStudentInfo(10);
		s.getStudentInfo(10, "   Siby");
		s.getStudentInfo("abc@gmail.com   ",1234567890);
	}
}
