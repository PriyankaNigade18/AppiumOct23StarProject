package driverSession;

import java.net.MalformedURLException;
import java.time.Duration;

import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;

public class LocatorDemo {

	public static void main(String[] args) throws MalformedURLException
	{

		
		AppiumDriver driver=CreateAppiumSession.initializeSession();

		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement ele1=driver.findElement(AppiumBy.accessibilityId("Access'ibility"));
		
		String text1=ele1.getText();
		System.out.println(text1);
		
		ele1.click();
		
		driver.navigate().back();
		System.out.println("Navigation completed!");
		
		
		//element -Accessibility
		WebElement ele2=driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"Accessibility\"]"));
		
		System.out.println("Element text is: "+ele2.getText());
		
		ele2.click();
		
		
		//accessibility service
		
		//driver.findElement(AppiumBy.id("android:id/text1")).click();//clicked on first option
		
		driver.findElements(AppiumBy.id("android:id/text1")).get(2).click();
		System.out.println("clicked on Accessiblity service");
		
		driver.navigate().back();
		
		//custome view
		driver.findElements(AppiumBy.className("android.widget.TextView")).get(4).click();
		System.out.println("Clicked with class name locator!");
		
		
		
		
		
		
		
		
		//element2
		
//		driver.findElement(AppiumBy.accessibilityId("Accessibility Service")).click();
//		
//		System.out.println("Clicked!");
//		
//		//Navigate
//		
//		driver.navigate().back();
//		
		
		
		
		
		
	}

}
