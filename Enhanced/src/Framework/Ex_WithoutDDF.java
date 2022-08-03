package Framework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex_WithoutDDF {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://kite.zerodha.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//enter UN
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys("ZAX405");
		
		//enter PWD
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Akshay@1437");
		
		//click on login
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
				
		//enter pin
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys("143707");
		
		//click on cnt btn
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
			
		//get user id
		String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String expUserID = "ZAX405";
		
		
		if(actUserID.equals(expUserID)) 
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		
		
		Thread.sleep(3000);
		
		driver.quit();				
	}

}
