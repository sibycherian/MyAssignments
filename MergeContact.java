package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		 
		 //Click on contacts Button
		 driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		 
		 //Click on Merge Contacts using Xpath Locator
		 driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		 
		 //Click on Widget of From Contact
		 driver.findElement(By.xpath("//table[@class='twoColumnForm']/tbody/tr/td/a/img")).click();
		 
		 //Click on First Resulting Contact
		 Set<String> fromContact = driver.getWindowHandles();
		 List<String> windows1 = new ArrayList<String>(fromContact);	
		 driver.switchTo().window(windows1.get(1));	
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//a[@class='linktext']")).click();
		 
		 //Click on Widget of To Contact
		 driver.switchTo().window(windows1.get(0));
		 driver.findElement(By.xpath("(//table[@class='twoColumnForm']/tbody/tr/td/a/img)[2]")).click();
		 
		 //Click on Second Resulting Contact
		 Set<String> toContact = driver.getWindowHandles();
		 List<String> windows2 = new ArrayList<String>(toContact);	
		 driver.switchTo().window(windows2.get(1));	
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
		 
		 //Click on Merge button using Xpath Locator
		 driver.switchTo().window(windows2.get(0));
		 driver.findElement(By.xpath("//a[text()='Merge']")).click();
		 
		 //Accept the Alert
		 Thread.sleep(3000);
		 driver.switchTo().alert().accept();
		 
		 //Verify the title of the page
		 String title = driver.getTitle();
		 System.out.println("Title of page :"+title);
	}

}
