package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage;
import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {
	//Inherit //object//By name of the class
	WebDriver drivers;
	
	//Login Data
	//String user_NAME ="demo@techfios.com";
	//String password ="abc123";
	
	@Test
		public void validUserShouldBeAbleToLogin() {
			drivers = BrowserFactory.init();
			
			LoginPage login = PageFactory.initElements(drivers, LoginPage.class);
			login.insertUserName("demo@techfios.com");
			login.insertPassword("abc123");
			login.clickSigninButton();
			
			DashboardPage dashboard = PageFactory.initElements(drivers, DashboardPage.class);
			dashboard.verifyDashboard(); 
			
			BrowserFactory.teardown();
			
		}

}
