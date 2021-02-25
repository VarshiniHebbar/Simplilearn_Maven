package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
   WebDriver driver;
   
   @FindBy(linkText="Log in")
   WebElement lnkLogin;
   
   @FindBy(name="user_login")
   WebElement editUsername;
   
   @FindBy(name="user_pwd")
   WebElement editPwd;
   
   @FindBy(className="rememberMe")
   WebElement chkBox;
   
   @FindBy(name="btn_login")
   WebElement btnPwd;
   
   public LoginPage(WebDriver testdriver) {
	   this.driver = testdriver;
	   
	   PageFactory.initElements(driver, this);
   }
	
public void login(String Username, String Password) {
		
	/*	WebElement lnklogin = driver.findElement(By.linkText("Log in"));
		lnklogin.click();
		
		WebElement editUsername = driver.findElement(By.name("user_login"));
		editUsername.sendKeys("Varshini.Hebbar@tecnotree.com");
		WebElement editPwd = driver.findElement(By.name("user_pwd"));
		editPwd.sendKeys("123455666");
		WebElement chkBox = driver.findElement(By.className("rememberMe"));
		chkBox.click();
		WebElement btnPwd = driver.findElement(By.name("btn_login"));
		btnPwd.click();
		*/
	lnkLogin.click();
	editUsername.sendKeys(Username);
	editPwd.sendKeys(Password);
	chkBox.click();
	btnPwd.click();
}
}
