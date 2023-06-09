package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IrctcTrainNames {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Navigate to https://erail.in/
		driver.get("https://erail.in/");
		
		//Clear the text in source & enter "ms" and tab or enter(keys.enter or tab)
		driver.findElement(By.id("txtStationFrom")).clear();
		driver.findElement(By.id("txtStationFrom")).sendKeys("ms",Keys.ENTER);
		
		//Clear the text in destination & enter "co" and tab or enter(keys.enter or tab)
		driver.findElement(By.id("txtStationTo")).clear();
		driver.findElement(By.id("txtStationTo")).sendKeys("co",Keys.ENTER);

		//Uncheck sort on date
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		//Store all the train names in a list
		List<WebElement> trainnames = driver.findElements(By.xpath("//div[@id='divTrainsList']/table/tbody//td[2]/a"));
		int trainnamessize = trainnames.size();
		System.out.println("Number of trains = "+trainnamessize);
		System.out.println("------------------------------------");
		
		//print page title
		String title = driver.getTitle();
		System.out.println("Page Title :"+title);
		System.out.println("------------------------------------");
		
		//print train names
		System.out.println("List of train names :");
		System.out.println("------------------------------------");
		for (int i = 0; i < trainnamessize; i++) {
			String tn = trainnames.get(i).getText();
			System.out.println(tn);
		}
	}

}
