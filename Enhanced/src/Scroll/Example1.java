package Scroll;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Example1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(2500);
		
		//down--> 2nd parameter +ve value
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(0,2000)");
		
		//up--> 1st parameter -ve value
		
		((JavascriptExecutor)driver).executeScript("window.scrollBy(-1000,0)");


	}

}
