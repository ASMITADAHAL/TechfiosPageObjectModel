package utill;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrowserFactory {
	static WebDriver driver;
	public static WebDriver startsBrowser(String browserName,String url)
	{
		if (browserName.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver",".\\Driver\\chromedriver.exe");
		driver=(WebDriver) new ChromeDriver();
		}
		driver.get(url);
		return driver;
	}

}
