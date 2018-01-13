package pack.Test2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test123 {

	WebDriver driver;

	@Test
	public void open() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Driver//chromedriver.exe");
		driver = new ChromeDriver();
driver.get("https:www.google.com123");		
		for (int i = 0; i < 5; i++) {
			System.out.println("Count is  " + (i + 1));

		}
	}
}
