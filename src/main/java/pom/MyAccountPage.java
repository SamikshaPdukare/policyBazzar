package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAccountPage {
	
	//Variable

	@FindBy(xpath="//div[@class='textCapitalize sc-ckVGcZ kWpXlQ']")private WebElement userName;
	
	//Constructor
	
	public MyAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);	
	}
	
	//Method
	
	public void UserName()
	{
		String actualUN = userName.getText();
		String expUn    = "Samiksha Kowale";
		if(expUn.equals(actualUN))
		{
		 System.out.println("Actual and Expected userName are matching TC is Passed");
		}
		else
		{
			System.out.println("Actual and Expected userName are not Matching TC is Failed");
		}
	}
	


}
