package mobileGuestures;

import java.net.MalformedURLException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;

import com.google.common.collect.ImmutableMap;

import driverSession.CreateAppiumSession;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class LonClickDemo {

	public static void main(String[] args) throws MalformedURLException 
	{

		AppiumDriver driver=CreateAppiumSession.initializeSession();

		//view
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		//drag and drop
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		
		//long click element-3 dot(duration for click in milliseconds)
		WebElement ele=driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_dot_3"));
		
		((AndroidDriver) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) ele).getId(),
			    "duration",2000
			));
		
		System.out.println("Long click action completed!");
		
		
		
		
		
		
		
	}

}
