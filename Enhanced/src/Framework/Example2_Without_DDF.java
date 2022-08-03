package Framework;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example2_Without_DDF {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.policybazaar.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		//click on SignIN btn Login Page
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		
		Thread.sleep(2000);
		
		//enter mob number on Window1
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys("9112780945");
		
		//click on SignIn With pwd link
		driver.findElement(By.xpath("(//span[text()='Sign in with Password'])[2]")).click();
		
		Thread.sleep(2000);
		
		//enter pwd on window2
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("@Nath451");
		
		//enter SignIn btn
		driver.findElement(By.xpath("//a[@id='login-in-with-password']")).click();
		
		Thread.sleep(2000);
		
		//display options from UserIcon dropdown from home page
		WebElement UserIcon = driver.findElement(By.xpath("(//a[@class='signed'])[1]"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(UserIcon).perform();
		
		Thread.sleep(2000);
		
		//click on Your Profile link from dropdown element
		driver.findElement(By.xpath("//span[text()=' Your profile ']")).click();
		
		Thread.sleep(2000);
		
		//Switch Child window
		
		 Set<String> allIDs = driver.getWindowHandles();
		 
		 ArrayList<String> al = new ArrayList<String>(allIDs);
		 
		 driver.switchTo().window(al.get(1));
		 
		
		 //get profileName child window
			String actProfileName = driver.findElement(By.xpath("//div[@class='sc-ckVGcZ kWpXlQ']")).getText();
			String expProfileName = "OmNath";
			
			
			if (actProfileName.equals(expProfileName)) 
			{
				System.out.println("Pass: login to correct profile ");
			}
			else 
			{
				System.out.println("Fail: login to wrong profile ");
			}
	

	}

}
