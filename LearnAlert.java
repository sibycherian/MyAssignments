package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

		public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Automate all alerts on this page
		driver.get("https:www.leafground.com/alert.xhtml");
		
		//SIMPLE ALERT
		System.out.println("SIMPLE ALERT");
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		//switch control to alert 
		Alert simpleAlert = driver.switchTo().alert(); 
		String simpleAlerttext1 = simpleAlert.getText();
		System.out.println(simpleAlerttext1);
		Thread.sleep(2000);
		//accept the alert
		simpleAlert.accept();
		//driver.switchTo().alert().accept();		
		String simpleAlerttext2  = driver.findElement(By.id("simple_result")).getText();
		System.out.println(simpleAlerttext2);
		
		
		//CONFIRM ALERT - 2 actions
		System.out.println("CONFIRM ALERT");
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirmAlert = driver.switchTo().alert();	
		Thread.sleep(3000);
		confirmAlert.dismiss();
		String confirmAlerttext  = driver.findElement(By.id("result")).getText();
		System.out.println(confirmAlerttext);
		
		//SWEET ALERT
		System.out.println("SWEET ALERT");
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();
		
		//SWEET MODAL DIALOG
		System.out.println("SWEET MODAL DIALOG");
		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-closethick'])[2]")).click();
		
		//PROMPT ALERT
		System.out.println("PROMPT ALERT");
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert promptAlert = driver.switchTo().alert();
		String promptAlerttext1 = promptAlert.getText();
		System.out.println(promptAlerttext1);
		Thread.sleep(3000);
		promptAlert.sendKeys("Siby");
		promptAlert.accept();
		String promptAlerttext2 = driver.findElement(By.id("confirm_result")).getText();
		System.out.println(promptAlerttext2);

		//SWEET ALERT
		System.out.println("SWEET ALERT");
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		
		//MIN & MAX
		System.out.println("MIN & MAX");
		driver.findElement(By.xpath("//span[text()='Delete']/following::span[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='ui-dialog-titlebar-icon ui-dialog-titlebar-close ui-corner-all'])[3]")).click();
		
	}
}
