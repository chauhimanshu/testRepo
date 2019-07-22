import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.*;

public class gmail {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/home/qainfotech/Downloads/chromedriver2");
		driver = new ChromeDriver();
		driver.get(
				"https://www.google.com/");
		driver.findElement(By.cssSelector("[title='Search']")).sendKeys("gmail" + Keys.ENTER);

		driver.findElement(By.xpath("//h3[text()='LOGIN Google - Sign in - Google Accounts']")).click();
		Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Sign in")).click();
	driver.switchTo().window("1");
		 driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("himanshuc088.hc@gmail.com");
		 driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@type='password']")).sendKeys("abshdhdh");
		 driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click(); 

	}
	
}
