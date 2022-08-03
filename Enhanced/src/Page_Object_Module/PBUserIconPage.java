package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PBUserIconPage 
{
	@FindBy(xpath="//span[text()=' My profile ']")private WebElement MyAccProfile;
	
	public PBUserIconPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickPBUserIconPageMAP()
	{
		MyAccProfile.click();
	}
	
}
