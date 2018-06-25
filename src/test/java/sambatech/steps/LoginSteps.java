package sambatech.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import sambatech.page.InicialPage;
import sambatech.page.LoginPage;

public class LoginSteps {
	
	
    @Given("Informei um email e senha valida")
    public void informarEmailSenha() {
    	LoginPage loginPage = new LoginPage();
    	loginPage.informarEmailSenha ();
    	
    }
    @When ("Cliquei no botao Entrar")
    public void clicarEntrar() {
    	LoginPage loginPage = new LoginPage();
    	loginPage.clicarEntrar ();
    	
    }
    @Then ("O sistema logara e apresentara a pagina inicial")
    public void verificaPagina() {
    	boolean sistemaLogou = InicialPage.verificaPagina ();
        if (sistemaLogou) {
        	System.out.println("Sistema logou corretamente!");
        } else {
        	System.out.println("Erro: Sistema nao logou!");
        }
        
    	
    }

}
