package pom;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUserName {

	public static void main(String[] args, Object CommonMethods) throws InterruptedException {
			
		WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//get url
		
		driver.get("https://www.policybazaar.com/");
		 
		commonMethod.CommonMethods.implicitWait(driver,5000);
		
		//Create object of login page
		
		LoginPage login = new LoginPage(driver);
		
		login.clickOnHomePageSignInButton();
		
		Thread.sleep(1000);
		
		login.enterMobileNum();
		
		Thread.sleep(500);
		
		login.clickOnSignInWithPassword();
		
		Thread.sleep(500);
		
		login.enterPassword();
		
		Thread.sleep(500);
		
		login.clickOnSignInButton();
		
		Thread.sleep(2000);
		
		login.clickOnMyAccount();
		
		Thread.sleep(3000);
		
		login.clickOnMyProfile();
		
		//new tab will be open , we need to switch to new tab
		
		Set<String> allId = driver.getWindowHandles();	
		
		List<String>al = new ArrayList<String>(allId);
		
		//switching focus to myAccountapge
		
		driver.switchTo().window(al.get(1));
		
		//create object of My accountPage
		
		Thread.sleep(1000);
		
		MyAccountPage myac = new MyAccountPage(driver);
		
		myac.UserName();
		
		driver.quit();
	}

}
