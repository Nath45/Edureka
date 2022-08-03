package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

//POM class1
public class PBLoginPage 
{
	//Step1: Declaration
	@FindBy(xpath="//a[@class='sign-in']")private WebElement SignIn;  
	//private WebElement SignIn=driver.findElement(By.xpath("//a[@class='sign-in']"))
	
	@FindBy(xpath="//div[text()='My account']")private WebElement MyaccIcon;
	
	WebDriver driver1;
	
	
	//Step2: Initialization
	public PBLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;  //assign local object info to global object
		
	}
	
	//step3: 
		public void clickPBLoginPageSignIN()
		{
			SignIn.click();
		}
			
		
		public void mouseOverPBLoginPageMyAccIcon() 
		{
			Actions act=new Actions(driver1);
			act.moveToElement(MyaccIcon).perform();		
		}

	
}
