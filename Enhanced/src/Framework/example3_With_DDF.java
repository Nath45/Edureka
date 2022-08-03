package Framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class example3_With_DDF {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		FileInputStream file = new FileInputStream("E:\\Study\\26 Mar Eve.xlsx");
		
                  Sheet sh = WorkbookFactory.create(file).getSheet("DDF");
                  
          		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");			
        		WebDriver driver=new ChromeDriver();		
        		driver.manage().window().maximize();
        		
        		driver.get("https://kite.zerodha.com/");
        	
        		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        		
        		//Enter UN
        		driver.findElement(By.xpath("//input[@id='userid']")).sendKeys(sh.getRow(0).getCell(0).getStringCellValue());
        		
        		//Enter Password
        		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(sh.getRow(0).getCell(1).getStringCellValue());
        		
        		//Click On login button
        		driver.findElement(By.xpath("//button[@type='submit']")).click();
        		
        		//Enter Pin
        		driver.findElement(By.xpath("//input[@id='pin']")).sendKeys(sh.getRow(0).getCell(2).getStringCellValue());
        		
        		//Click on continue button
        		driver.findElement(By.xpath("//button[@type='submit']")).click();
        		
        		//Get UI
        		 String actUI = driver.findElement(By.xpath("//span[@class='user-id']")).getText();
        		
        		String expUI = sh.getRow(0).getCell(3).getStringCellValue();
        		
        		if(actUI.equals(expUI))
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
