package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TelaInicialPage extends BasePage {
	
	public void acionarAbaadmin() {
		abaAdmin.click();
	
	}
	
	@FindBy(linkText = "//button[@type='button'][contains(.,'Add')]")
	public WebElement botaoAdd;
	
	public void acionarBotaoAdd() {
	
	}
}




