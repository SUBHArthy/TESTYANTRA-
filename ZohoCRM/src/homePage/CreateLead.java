package homePage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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
		driver.findElement(By.xpath("//input[@value='New Lead']")).click();
		driver.findElement(By.name("property(First Name)")).sendKeys("ARIJIT");
		driver.findElement(By.name("property(Company)")).sendKeys("TestYantra");
		driver.findElement(By.name("property(Last Name)")).sendKeys("Mallick");
		driver.findElement(By.name("Button")).click();
	}

}
