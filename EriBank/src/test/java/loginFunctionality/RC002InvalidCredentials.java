package loginFunctionality;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class RC002InvalidCredentials extends Utility {
	@Test
	public void Login_Into_Invalid_Credentials() throws InterruptedException, IOException {

		driver.findElement(By.id("android:id/button1")).click();
		driver.findElement(By.id("com.experitest.ExperiBank:id/usernameTextField")).sendKeys("companys");
		Thread.sleep(2000);
		driver.findElement(By.id("com.experitest.ExperiBank:id/passwordTextField")).sendKeys("companys");
		Thread.sleep(2000);
		driver.findElement(By.id("com.experitest.ExperiBank:id/loginButton")).click();
		Thread.sleep(2000);

		File ss = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(ss,
				new File("C:\\Users\\Mahmudul Hasan\\eclipse-workspace\\DemoAppium\\Screenshoot\\Loginfailed.jpg"));
		driver.quit();
		System.out.println("Login Failed");
	}
}
