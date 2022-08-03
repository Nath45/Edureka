package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Example4_With_DDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file = new FileInputStream("E:\\Study\\26 Mar Eve.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF1");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.policybazaar.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		Thread.sleep(2000);
		
		//click on SignIN btn Login Page
		driver.findElement(By.xpath("//a[@class='sign-in']")).click();
		
		Thread.sleep(2000);
		
		//Enter MobNum on window1
		String MobNum = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("(//input[@type='number'])[2]")).sendKeys(MobNum);
		
		//Click on Sign In with password Buttton
		driver.findElement(By.xpath("(//a[@id='central-loggin-with-pwd'])[2]")).click();
		
		Thread.sleep(2000);
		
		//Enter pwd on window2
		String pwd = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys(pwd);
		
		//Click on Sign in btn
		driver.findElement(By.xpath("//span[text()='Sign in']")).click();
		
		Thread.sleep(2000);
		
		//Display options from UserIcon dropdown from home page
		 WebElement UserIcon = driver.findElement(By.xpath("(//a[@class='signed'])[1]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(UserIcon).perform();
		Thread.sleep(2000);
		
		//Click on your profile link from dropdown element
		driver.findElement(By.xpath("//span[text()=' Your profile ']")).click();
		
		Thread.sleep(2000);
		
		//Switch to child window
		Set<String> allIds = driver.getWindowHandles();    //Get Main page ID & child window ID
		ArrayList<String> al = new ArrayList<String>(allIds);  //{main PageID(0),child window ID(1)}
		
		driver.switchTo().window(al.get(1));
		
		Thread.sleep(2000);
		
		//Get profile name from child window
		String actProfileName =driver.findElement(By.xpath("//div[text()='OmNath']")).getText();
		String ExpProfileName = sh.getRow(0).getCell(2).getStringCellValue();
		
		Thread.sleep(2000);
		
		if(actProfileName.equals(ExpProfileName))
		{
			System.out.println("Pass: Login to correct account");
		}
		else
		{
			System.out.println("Fail: Login to wrong account");
		}
		
	}

}
