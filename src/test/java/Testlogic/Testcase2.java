package Testlogic;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Sourceclass.homepage;
import Sourceclass.loginpage;

public class Testcase2 extends launchquit {
@Test
	public void Login_search() {
		loginpage login = new loginpage(driver);
		 homepage h = new homepage(driver);
		 h.hoverover(driver);
		  h.signin();
		  login.login();
		  h.searching(); 
		}
	}

