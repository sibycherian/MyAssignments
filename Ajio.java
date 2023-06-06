package week3.day4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Ajio {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Launch the URL https://www.ajio.com/
		driver.get("https://www.ajio.com/");
		
//		In the search box, type as "bags" and press enter
		driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
		
//		To the left  of the screen under " Gender" click the "Men"
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		Thread.sleep(2000);
		
//		Under "Category" click "Fashion Bags"
		driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
		Thread.sleep(2000);
		
//		Print the count of the items Found. 
		String count = driver.findElement(By.className("length")).getText();
		System.out.println("Count of items :"+count);
		
//		Get the list of brand of the products displayed in the page and print the list.
		List<WebElement> brandProducts = driver.findElements(By.className("brand"));
		System.out.println("Size :"+brandProducts.size());		
		System.out.println("Brand Product List :");
		for (int i = 0; i < brandProducts.size(); i++) {
			String productList=brandProducts.get(i).getText();
			System.out.println(productList);
		}
		
//		Get the list of names of the bags and print it
		List<WebElement> bagNames = driver.findElements(By.className("nameCls"));
		System.out.println("Size :"+bagNames.size());
		System.out.println("Bag Name List :");
		for (int j = 0; j < bagNames.size(); j++) {
			String nameList = bagNames.get(j).getText();
			System.out.println(nameList);
		}
	}

}
