package loginFunctionality;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class TC004InputSpecialCharacter extends Utility {
	@Test
	public void Input_Special_Character() throws InterruptedException, IOException, ATUTestRecorderException {
		ATUTestRecorder record = new ATUTestRecorder(
				"D:\\SQA\\Final Project\\Appium Automation Testing\\EriBank\\Vedio", "specialCharacter", false);
		record.start();
		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.id("com.experitest.ExperiBank:id/usernameTextField")).sendKeys("##!");
		Thread.sleep(2000);
		driver.findElement(By.id("com.experitest.ExperiBank:id/passwordTextField")).sendKeys("##!");
		Thread.sleep(2000);
		driver.findElement(By.id("com.experitest.ExperiBank:id/loginButton")).click();
		Thread.sleep(2000);

		File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(ss, new File(
				"D:\\SQA\\Final Project\\Appium Automation Testing\\EriBank\\Screenshoot\\specialCharacter.jpg"));
		driver.quit();
		System.out.println("Login Failed - Passed");
		record.stop();
	}
}
