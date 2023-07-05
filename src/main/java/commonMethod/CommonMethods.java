package commonMethod;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

public class CommonMethods {
	
	public static void implicitWait(WebDriver driver,long waitTime)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(waitTime));
	}
	
	//Screenshot
	
	public static void captureScreenshot(WebDriver driver,String fileName) throws IOException
	{
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		 File dest= new File("N:\\Screenshot\\Test2.png");
		 
		 FileHandler.copy(src, dest);

	}
	
	//Scrolling
	
	public static void scrollingIntoview(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollingView(true)", element);
	}
	
	//read data from excel Sheet

	public static void main(String[] args) {

	
		
		{
			
		}
		
		
		
		
	}

}
