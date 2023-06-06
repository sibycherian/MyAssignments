package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Load the url
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		
		//handle the frame 
		driver.switchTo().frame("iframeResult");
		
		//Click Try It button
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		//Pass a text in the alert and get the Text  and accept the alert
		Alert alert = driver.switchTo().alert();
		Thread.sleep(3000);
		alert.sendKeys("Siby Cherian");
		alert.accept();

		//Verify yor name is printed successfully
		String text = driver.findElement(By.id("demo")).getText();
		System.out.println(text);
	}

}
