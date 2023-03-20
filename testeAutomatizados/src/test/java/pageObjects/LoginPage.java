package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	
	@FindBy(name = "username")
	private WebElement campoUsuario;
	
	@FindBy(name = "password")
	private WebElement informarCampoSenha;

	@FindBy(xpath = "//button[contains(@type,'submit')]")
	private WebElement acionarBotaoLogin;
	
	//@FindBy(linkText = "Forgot your password?")
	//private WebElement link;
	
//	@FindBy(css = "Forgot your password?")
//	private WebElement link;
	
//	@FindBy(xpath = "//input[@name='username']")
//	private WebElement link;	
	//input[@name='password']
	
	
	public void informarCampoUsuario(String Usuario) {
		campoUsuario.sendKeys(Usuario);
	}
	
	public void informarCampoSenha (String senha) {
		informarCampoSenha.sendKeys(senha);		
	}

	public void acionarBotaoLogin () {
		acionarBotaoLogin.click();
	}

	public void realizarLogin(String Usuario, String senha) {
		informarCampoUsuario (Usuario);
		informarCampoSenha (senha);
		acionarBotaoLogin ();
		
	}
}



