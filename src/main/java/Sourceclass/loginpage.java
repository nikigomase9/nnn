package Sourceclass;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginpage {
	@FindBy(css = "#ap_email")
	WebElement email;
	
	@FindBy(css= "#continue")
	WebElement continuebtn ;
	
	@FindBy(id= "ap_password")
	WebElement Password;
	
	@FindBy(id= "signInSubmit")
	WebElement signin ;
	
	
	public void login() {
		email.sendKeys("nikigomase9@gmail.com");
		continuebtn.click();
		Password.sendKeys("amazonpass@123");
		signin.click();
	}
		
	public loginpage(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
}
