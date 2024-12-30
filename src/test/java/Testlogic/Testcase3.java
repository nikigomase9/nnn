package Testlogic;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Sourceclass.homepage;
import Sourceclass.loginpage;
import Sourceclass.searchresult;

public class Testcase3 extends launchquit {
	@Test
public void login_searching_add() throws InterruptedException {
	loginpage login = new loginpage(driver);
	 homepage h = new homepage(driver);
	h.hoverover(driver);
	h.signin();
	  login.login();
	  h.searching(); 
	  searchresult s = new searchresult(driver);
	  Thread.sleep(2000);
	  s.addproduct();
	  s.verifyaddedproduct(driver);
	 // System.out.println(producttext);
}
}
