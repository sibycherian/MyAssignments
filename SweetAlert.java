package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SweetAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		//Enter MS in ‘From’ textbox
		driver.findElement(By.xpath("//span[@class='ng-tns-c57-8 ui-autocomplete ui-widget']/input")).sendKeys("MS");
		driver.findElement(By.xpath("//span[text()='CHENNAI EGMORE - MS']")).click();
		
		//Enter Cape in ‘To’ textbox
		driver.findElement(By.xpath("//span[@class='ng-tns-c57-9 ui-autocomplete ui-widget']/input")).sendKeys("Cape");
		driver.findElement(By.xpath("//span[text()='KANYAKUMARI - CAPE']")).click();
		
		//Click search button 
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		Thread.sleep(2000);
		
		//Click refresh button
		driver.findElement(By.xpath("//div[@class='col-xs-12 link']")).click();
		Thread.sleep(2000);
		
		//Click WL and Click BookNow button
		driver.findElement(By.xpath("//div[@class='WL col-xs-12']")).click();
		driver.findElement(By.xpath("//button[@class='btnDefault train_Search ng-star-inserted']")).click();
		Thread.sleep(2000);
		
		//Click No button in the alert
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-clickable'])[2]")).click();

	}

}
