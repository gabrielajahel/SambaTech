package sambatech.page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import sambatech.commons.TestRule;

public class InicialPage {
	
	
	public InicialPage() {
		PageFactory.initElements(TestRule.getDriver(), this);
	}

	 public static boolean verificaPagina() {
			
		 try {
	    		synchronized(TestRule.getDriver()) {
	    			TestRule.getDriver().wait(9000);
	    		}
	    	} catch (InterruptedException e) {
	    		e.printStackTrace();
	    	}
		 
		 
		  int intQuantidadeItensEncontrados = TestRule.getDriver().findElements(By.id("navbar-project-name")).size();
		    if (intQuantidadeItensEncontrados > 0) {
		      // Fez login
		      return true;
		    } else {
		      // Nao Fez login
		      return false;
		    }
		  }

}