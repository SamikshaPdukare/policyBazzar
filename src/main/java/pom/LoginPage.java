package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	//Variable
	
	@FindBy(xpath="//a[text()='Sign in']")private WebElement signInButtonHomePage;
	
	@FindBy(xpath="(//input[@type='number'])[2]")private WebElement mobileNumberField;
	
	@FindBy(xpath="(//span[text()='Sign in with Password'])[2]")private WebElement signwithPassword;
	
	@FindBy(name="password")private WebElement passwordField;
	
	@FindBy(xpath="//span[text()='Sign in']")private WebElement signInField;
	
	@FindBy(xpath="//div[text()='My Account']")private WebElement myAccountField;
	
	@FindBy(xpath="//span[text()=' My profile ']")private WebElement myProfileField;
	
	//Constructor

	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickOnHomePageSignInButton() //span[text()='My profile']

	{
		signInButtonHomePage.click(); 	
	}
	public void enterMobileNum()
	{
		mobileNumberField.sendKeys("9511600531");
	}
	public void clickOnSignInWithPassword()
	{
		signwithPassword.click();
	}
	public void enterPassword()
	{
		passwordField.sendKeys("Samiksha@16");
	}
	public void clickOnSignInButton()
	{
		signInField.click();
	}
	public void clickOnMyAccount()
	{
		myAccountField.click();
	}
	public void clickOnMyProfile()
	{
		myProfileField.click();
	}
	


}
