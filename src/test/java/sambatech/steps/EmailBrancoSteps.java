package sambatech.steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sambatech.page.LoginBrancoPage;

public class EmailBrancoSteps {

    @Given ("Informei email em branco e senha valida")
    public void informarEmailSenha() {
    	LoginBrancoPage loginBrancoPage = new LoginBrancoPage();
    	loginBrancoPage.informarEmailSenha ();
    	
    }
    @When ("Cliquei no botao Entrar")
    public void clicarEntrar() {
    	LoginBrancoPage loginInvalidoPage = new LoginBrancoPage();
    	loginInvalidoPage.clicarEntrar ();
    	
    }
    @Then ("O sistema devera apresentar uma mensagem informando que o campo email é obrigatorio")
    public void verificaMensagem() {
    	LoginBrancoPage loginBrancoPage = new LoginBrancoPage();
		boolean blnExibiuMensagemSucesso = loginBrancoPage.verificaMensagem ();
    	Assert.assertTrue("Não exibiu a mensagem de Campo Obrigatorio",blnExibiuMensagemSucesso);
    }
}
