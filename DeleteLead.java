package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {
		
		//Step1 - launch browser
		ChromeDriver driver = new ChromeDriver();
		//to maximise screen
		driver.manage().window().maximize();
		//add wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//Step2 - Load URL
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("Demosalesmanager");
		driver.findElement(By.xpath("//input[contains(@id, 'pa')]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();	
		driver.findElement(By.xpath("//div[@id='label']/a")).click();
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		//Click Find leads
		driver.findElement(By.xpath("//a[contains(text(), 'Find')]")).click();
		//Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		//Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9789859418");
		//Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Capture lead ID of First Resulting lead
		String LeadId=driver.findElement(By.xpath("//a[text()='16452']")).getText();
		System.out.println(LeadId);
		
		//Click First Resulting lead
		driver.findElement(By.xpath("//a[text()='16452']")).click();
		//Click Delete
		driver.findElement(By.xpath("//a[text()='Delete']")).click();
		//Click Find leads
		driver.findElement(By.xpath("//a[contains(text(), 'Find')]")).click();
		//Enter captured lead ID
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("16452");
		//16	Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		//Verify message "No records to display" in the Lead List. This message confirms the successful deletion
		String message=driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
		System.out.println(message);
		
		String title=driver.getTitle();
		System.out.println(title);
		
		//Close the browser (Do not log out)
		driver.close();

	}

}
