package sambatech.page;

import org.openqa.selenium.support.PageFactory;

import sambatech.commons.TestRule;


public class LoginPage extends LoginElementMap {

	public LoginPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}
	
	public void informarEmailSenha() {
		inputEmail.sendKeys("avaliacao_qa_samba@sambatech.com.br");
		inputPassword.sendKeys("123456789");
		
	}

	public void clicarEntrar() {
		login.click();
		
	}

}
