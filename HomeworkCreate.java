package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeworkCreate {

	public static void main(String[] args) {
		
		//Step1 - launch browser
		ChromeDriver driver = new ChromeDriver();
		//to maximise screen
		driver.manage().window().maximize();
		//add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Step2 - Load URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//	Enter UserName and Password Using Id Locator
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click on Login Button using Class Locator
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on CRM/SFA Link
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on Leads Button
		driver.findElement(By.linkText("Leads")).click();
		
		//Click on create Lead Button
		driver.findElement(By.linkText("Create Lead")).click();
		  
		//Enter CompanyName using id Locator
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LnW");
		 
		//Enter FirstName using id Locator
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Siby");
		 
		//Enter LastName using id Locator
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Cherian");

		 //Enter your mail-id
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sibycherian@gmail.com");

	     //phone number 
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9789859418");

		//Click on create Lead Button Using name Locator
		driver.findElement(By.name("submitButton")).click();
				
		driver.close();
		
	}

}
