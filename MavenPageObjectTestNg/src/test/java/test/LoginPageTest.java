package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.LoginPage;
import utill.BrowserFactory;

public class LoginPageTest {
@Test 
public void TechfiosLogintest() {
	WebDriver driver=BrowserFactory.startsBrowser("chrome","https://techfios.com/test/billing/?ng=login/");
	LoginPage logintotechfios=PageFactory.initElements(driver, LoginPage.class);
	logintotechfios.Login("techfiosdemo@gmail.com", "abc123");
	driver.close();
	driver.quit();
}
	
	
	
	
	
	
}
