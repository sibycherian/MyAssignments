package week3.day3;

public class Automation extends MultipleLanguage{

	@Override
	public void ruby() {	
		System.out.println("Ruby in concrete class Automation");		
	}
	
	public void Java() {
		System.out.println("Java from interface Language to concrete class Automation");
	}

	public void Selenium() {
		System.out.println("Selenium from interface TestTool to concrete class Automation");
	}
	
	public static void main(String[] args) {
	
		Automation a=new Automation();
		a.ruby();
		a.Java();
		a.python();
		a.Selenium();
	}
}
