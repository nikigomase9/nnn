package Sourceclass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homepage {
	
	@FindBy(xpath= "//span[@class='nav-line-2 ']")
	WebElement accountlist;
	
	@FindBy(xpath="//span[.='Sign in']")
	WebElement signin ;
	
	@FindBy(id="twotabsearchtextbox")
	WebElement searchbox;
	
	
	public void hoverover(WebDriver driver)
		 {
		Actions act = new Actions ( driver);
		act.moveToElement(accountlist).perform();	
	}
	public void signin() {
		signin.click();
	}
	
	public void searching() {
		searchbox.sendKeys("mobiles"+Keys.ENTER);
	}
	
	public homepage(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
}
