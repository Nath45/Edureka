package Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2_With_DDF 
{
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("E:\\Study\\26 Mar Eve.xlsx");
		Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
	
		
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");			
		WebDriver driver=new ChromeDriver();		
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
	
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//enter UN
		String username = sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(username);
		
		//enter PWD
		String password = sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
		
		//click on login
		driver.findElement(By.xpath("//button[@class='button-orange wide']")).click();
				
		//enter pin
		String pin = sh.getRow(0).getCell(2).getStringCellValue();
		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(pin);
		
		//click on cnt btn
		driver.findElement(By.xpath("//button[text()='Continue ']")).click();
			
		//get user id
		String actUserID = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
		String expUserID = sh.getRow(0).getCell(3).getStringCellValue();
		
		
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