package week3.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
	
		//Launch the chromebrowser
		ChromeDriver driver = new ChromeDriver();
		//Load the URL
		driver.get("https://en-gb.facebook.com/");	
		//Maximise the window
		driver.manage().window().maximize();	
		//Add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Click on Create New Account button
		driver.findElement(By.xpath("//a[text()='Forgotten password?']/following::a")).click();
		//Enter the first name
		//driver.findElement(By.xpath("//input[@name='firstname']/parent::div")).sendKeys("Siby");
		driver.findElement(By.name("firstname")).sendKeys("Siby");
		//driver.findElement(By.xpath("//div[text()='First name']/following-sibling::input")).sendKeys("Siby");
		//Enter the last name
		driver.findElement(By.name("lastname")).sendKeys("Cherian");
		//driver.findElement(By.xpath("//div[text()='Surname']/following-sibling::input")).sendKeys("Cherian");
		//Enter the mobile number
		driver.findElement(By.xpath("//div[contains(text(),'Mobile')]/following-sibling::input")).sendKeys("9789859418");
		//Enter the password
		driver.findElement(By.xpath("//div[contains(text(),'New')]/following-sibling::input")).sendKeys("abc");
		//Handle all the three drop downs
		Select date = new Select(driver.findElement(By.xpath("//select[@id='day']")));
		date.selectByVisibleText("31");
		Select month = new Select(driver.findElement(By.xpath("//select[@id='month']")));
		month.selectByVisibleText("Jul");
		Select year = new Select(driver.findElement(By.xpath("//select[@id='year']")));
		year.selectByVisibleText("1981");
		//Select the radio button "Female" ( A normal click will do for this step) 
		driver.findElement(By.xpath("//label[text()='Female']/following-sibling::input")).click();
		//driver.close();
	}

}
