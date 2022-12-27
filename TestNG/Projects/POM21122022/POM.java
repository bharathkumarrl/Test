package POM21122022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM
{
	//Declaration
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement BTN ;

	//Initialization
	POM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	//Utilization
	public void Button()
	{
		BTN.click();
	}

}
