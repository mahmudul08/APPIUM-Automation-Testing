package loginFunctionality;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import io.appium.java_client.android.AndroidDriver;

public class Utility {
	WebDriver driver;

	@BeforeTest
	public void setup() throws MalformedURLException, InterruptedException {
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("platformName", "Android");
		cap.setCapability("appium:deviceName", "emulator-5554");
		cap.setCapability("appium:app", "D:\\SQA\\Final Project\\Appium Automation Testing\\EriBank\\EriBank.apk");
		cap.setCapability("appium:ensureWebviewsHavePages", true);
		cap.setCapability("appium:nativeWebScreenshot", true);
		cap.setCapability("appium:newCommandTimeout", 3600);
		cap.setCapability("appium:connectHardwareKeyboard", true);
		cap.setCapability("appPackage", "");
		cap.setCapability("appPackage", "");

		URL URL = new URL("http://127.0.0.1:4723/wd/hub");

		driver = new AndroidDriver<WebElement>(URL, cap);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(5000);

	}

	@AfterClass
	public void teardown() {
		if (driver != null)
			driver.quit();
	}
}
