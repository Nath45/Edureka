package Page_Object_Module;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBProfilePage 
{
	@FindBy(xpath="//div[text()='OmNath']")private WebElement ProfileName;
	
	WebDriver driver1;
	public PBProfilePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		driver1=driver;
	}
	
	public void switchToChildWindow()
	{
		Set<String> allIds = driver1.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(allIds);
		driver1.switchTo().window(al.get(1));
	}
	
	public void verifyPBProfilePagePN()
	{
		String actPN=ProfileName.getText();
		String expPN="OmNath";
		if(actPN.equals(expPN))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
	

}
