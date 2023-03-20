package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CadastrarUsuarioPage {

	@FindBy(xpath = "//a[contains(.,'Admin')]")
	private WebElement campoEmployer;

	@FindBy(xpath = "(//input[contains(@autocomplete,'off')])[1]")
	private WebElement campoUsuario;

	@FindBy(xpath = "(//input[contains(@type,'password')])[1]")
	private WebElement campoPassword;

	@FindBy(xpath = "(//input[contains(@type,'password')])[2]")
	private WebElement campoConfirmarPassword;

	@FindBy(xpath = "//button[contains(.,'Save')]")
	private WebElement botaoSalvar;

	public void clicarBotaoAdmin() {
		campoEmployer.click();
	}

	public void informarCampoUserName(String userName) {
		campoUsuario.sendKeys(userName);
	}

	public void informarcampoPassword(String senha) {
		campoPassword.sendKeys(senha);
	}

	public void informarCampoConfirmarPassword(String senha) {
		campoConfirmarPassword.sendKeys(senha);
	}

	public void acionarBotaoSalvar() {
		botaoSalvar.click();
	}

}
