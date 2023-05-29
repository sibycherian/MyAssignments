package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		
		//Use Advance Xpath
		
		//Step1 - launch browser
		ChromeDriver driver = new ChromeDriver();
		//to maximise screen
		driver.manage().window().maximize();
		//add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Step2 - Load URL
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		//Enter UserName and Password Using Id Locator
		//advanced xpath
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Demosalesmanager");
		//partial attribute id match xpath
		driver.findElement(By.xpath("//input[contains(@id, 'pa')]")).sendKeys("crmsfa");
		//Click on Login Button using Class Locator - attribute xpath
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();	
		//Click on CRM/SFA Link
		//partial attribute text match xpath
		//driver.findElement(By.xpath("//a[contains(text(), 'SFA')]")).click();	
		//advanced xpath
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		//Click on Leads Button - //text based xpath
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		//Click on create Lead Button
		driver.findElement(By.xpath("//a[contains(text(), 'Create')]")).click();
		//Enter CompanyName using id Locator
		driver.findElement(By.xpath("//input[contains(@id, 'company')]")).sendKeys("LnW");
		//Enter FirstName using id Locator
		driver.findElement(By.xpath("//input[contains(@id, 'first')]")).sendKeys("Siby");
	    //Enter LastName using id Locator
		driver.findElement(By.xpath("//input[contains(@id, 'last')]")).sendKeys("Cherian");
        //Enter your mail-id
		driver.findElement(By.xpath("//input[contains(@id, 'Email')]")).sendKeys("sibycherian@gmail.com");
        //phone number 
		driver.findElement(By.xpath("//input[contains(@id, 'Number')]")).sendKeys("9789859418");
        //Click on create Lead Button Using name Locator*/
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		String title=driver.getTitle();
		System.out.println(title);
	}

}
