package lg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


public class LgAppliances {
	WebDriver driver;



	@Test()
	public void login(String id, String pwd, String pom, String tom) {
			System.out.println(System.getProperty("user.dir"));

	}


	
	@AfterTest
	public void finish() {
		System.out.println("dono hogaye cange");
		//
		//
		

	}

}
