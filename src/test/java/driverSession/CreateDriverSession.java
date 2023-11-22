package driverSession;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class CreateDriverSession {

	public static void main(String[] args) throws MalformedURLException
	{

		DesiredCapabilities cap=new DesiredCapabilities();
		cap.setCapability("platformName","Android");
		cap.setCapability("appium:automationName","UiAutomator2");
		cap.setCapability("appium:deviceName","pixel_6");
		cap.setCapability("appium:udid","emulator-5554");
		
		//application path
		String appPath=System.getProperty("user.dir")+"\\src\\test\\resources\\ApiDemos-debug.apk";
		
		cap.setCapability("appium:app",appPath);
		
		//server connectivity
		
		URL url=new URL("http://0.0.0.0:4723");
		
		//create AppiumSeesion
		AppiumDriver driver=new AndroidDriver(url,cap);
		
		System.out.println("Session id for connected session is: "+driver.getSessionId());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
