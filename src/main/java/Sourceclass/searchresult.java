package Sourceclass;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class searchresult {

	@FindBy(css = "#a-autoid-1-announce")
	WebElement addproduct;
	
	
	@FindBy (xpath= "//ul/li[@class='a-spacing-mini sc-item-product-title-cont'][1]")
	WebElement product ;
	
	
    @FindBy(css= "[href=\"/cart?ref_=ewc_gtc\"]")
    WebElement gotocart;
	
    public void verifyaddedproduct(WebDriver driver) {
    	gotocart.click();
    	 String currenturl = driver.getCurrentUrl();
    	
	String producttext= product.getText();
	System.out.println(producttext);
	if ( currenturl.contains("cart")&& producttext.contains("Redmi Note 14 5G (Phantom")) {
		System.out.println("Test passed ");
	}
	
	else {
		System.out.println("Test Failed");
	}
 }
	public void addproduct()
		 {
		  addproduct.click();
		  
		 }
	public searchresult(WebDriver driver) {
		PageFactory.initElements( driver, this);
	}
	
}

