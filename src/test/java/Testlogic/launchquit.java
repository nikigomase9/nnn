package Testlogic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import Sourceclass.homepage;

public class launchquit  {
	static WebDriver driver;
	
	//@Parameters("browser")
	@BeforeMethod
		public void launch () {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("https:/amazon.in");
			
	}
	
	
	@AfterMethod
	public void quit() {
		driver.quit();
	}
	

}
