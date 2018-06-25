package sambatech.page;

import org.openqa.selenium.support.PageFactory;

import sambatech.commons.TestRule;

public class LoginBrancoPage extends LoginElementMap {
	
	public LoginBrancoPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	
	public void informarEmailSenha() {
		inputEmail.sendKeys("");
		inputPassword.sendKeys("123456789");
		
	}

	public void clicarEntrar() {
		login.click();		
	}
	
	public boolean verificaMensagem() {
		String strMensagemExibida = campoObrigatorio.getText();
		if (strMensagemExibida.contains("Campo Obrigatorio")) {
			return true;
		}else {
			return false;
		}
     }
}
