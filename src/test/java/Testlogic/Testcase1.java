package Testlogic;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Sourceclass.homepage;
import Sourceclass.loginpage;

public class Testcase1  extends launchquit{
	@Test
	public void Login() {
  homepage h = new homepage(driver);
  h.hoverover(driver);
  h.signin();
  loginpage login = new loginpage(driver);
  login.login();
 
}
}