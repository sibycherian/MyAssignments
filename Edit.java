package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Edit {

	public static void main(String[] args) {

		//Use Advance Xpath
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Launch the browser
		driver.get("http://leaftaps.com/opentaps/control/main");
		//Enter the username - P to C
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Demosalesmanager");
		//Enter the password - ES to YS
		driver.findElement(By.xpath("//label[text()='Password']/following-sibling::input")).sendKeys("crmsfa");	
		//Click Login - EC to YC
		driver.findElement(By.xpath("//input[@id='password']/following::input")).click();
		//Click crm/sfa link - P to C
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		//Click Leads link - C to P
		driver.findElement(By.xpath("//a[text()='Leads']/parent::div")).click();
		//Click on Create Lead - link locator
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter company name	  
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input")).sendKeys("LnW");
		//Enter first name 
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@id='createLeadForm_firstName']")).sendKeys("Siby");
		//Enter last name 
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input[@id='createLeadForm_lastName']")).sendKeys("Cherian");
		//click on Create Lead button
		driver.findElement(By.name("submitButton")).click();
		//Click Edit
		driver.findElement(By.xpath("//a[@class='subMenuButton']/following-sibling::a[2]")).click();
		//Change the company name	
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input")).clear();
		driver.findElement(By.xpath("//span[@class='requiredField']/following::input")).sendKeys("SG");
		//Click Update 
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
					
		driver.close();

	}

}
