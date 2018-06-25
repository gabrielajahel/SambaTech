package sambatech.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginElementMap {
	protected WebElement inputEmail;
	protected WebElement inputPassword;
	protected WebElement login;
	@FindBy(xpath = "//*[@id=\"password_incorrect\"]")
	protected WebElement campoObrigatorio;
	

}
