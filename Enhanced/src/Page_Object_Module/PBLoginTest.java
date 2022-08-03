package Page_Object_Module;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PBLoginTest {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Study\\Selenium\\chromedriver_win32\\chromedriver.exe");			
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.policybazaar.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		PBLoginPage login=new PBLoginPage(driver);
		login.clickPBLoginPageSignIN();
		
		PBSignInWithMObNumPage MobNumPage=new PBSignInWithMObNumPage(driver);
		MobNumPage.setPBSignInWithMObNumPagemobNum();
		MobNumPage.clickPBSignInWithMObNumPagesignInWithPwd();
		
		PBSignInWithPwdPage PWD=new PBSignInWithPwdPage(driver);
		PWD.setPBSignInWithPwdPagePWD();
		PWD.clicksetPBSignInWithPwdPageSignIn();
		
		Thread.sleep(2000);
		login.mouseOverPBLoginPageMyAccIcon();
		
		PBUserIconPage UI= new PBUserIconPage(driver);
		UI.clickPBUserIconPageMAP();
		
		PBProfilePage PN= new PBProfilePage(driver);
		PN.switchToChildWindow();
		PN.verifyPBProfilePagePN();
		
		Thread.sleep(4000);
		
		driver.quit();

	}

}
