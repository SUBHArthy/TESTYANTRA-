package homePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class verifyCreatedLeadPage {

	public static void main(String[] args) {
		String key = "webdriver.chrome.driver";
		String value = "./driver/chromedriver.exe";
		System.setProperty(key, value);
		WebDriver driver = new ChromeDriver();
		driver.get("http://192.168.190.128:8080/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("userName")).sendKeys("rashmi@dell.com");
		driver.findElement(By.id("passWord")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@title='Sign In']")).click();
		driver.findElement(By.linkText("Leads")).click();
		boolean rs = driver.findElement(By.linkText("ARIJIT Mallick")).isDisplayed();

		if (rs) {
			System.out.println("created lead is displaying and pass");
		} else {
			System.out.println("created lead is not displaying and fail");
		}
driver.close();
	}

}
