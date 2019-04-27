package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Page.AddContactPage;
import Page.HomePage;
import Page.LoginPage;
import page.AddContact;
import utill.BrowserFactory;

public class AddContactTest {
	@Test
	public void AddingContact() throws InterruptedException {
		WebDriver driver=BrowserFactory.startsBrowser("chrome","http://techfios.com/test/billing/?ng=login/");
		LoginPage logintotechfios=PageFactory.initElements(driver,LoginPage.class);
		logintotechfios.Login("techfiosdemo@gmail.com", "abc123");
		HomePage  home= PageFactory.initElements(driver,HomePage.class);
		home.NavigatingToAddContact();
		
		AddContactPage contact=PageFactory.initElements(driver, AddContactPage.class);
		contact.FillingUpAddressForm("Umesh Gyawali", "Saint Elizebeth", "brishavsharma@gmail.com", "6138641295", "20 Axelrod Ave", "Brampton", "Ontario", "L6Y 5S8");
	Thread.sleep(10000);
		driver.close();
		driver.quit();
	}

}
