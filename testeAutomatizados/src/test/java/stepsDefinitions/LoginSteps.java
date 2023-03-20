package stepsDefinitions;
import static utils.Utils.*;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.LoginPage;

public class LoginSteps {
	
	@Quando("eu informar o usuario {string}")
	public void euInformarOUsuario(String Usuario) {
		Na(LoginPage.class).informarCampoUsuario(Usuario);
	}

	@Quando("informar a senha {string}")
	public void informarASenha(String senha) {
		Na(LoginPage.class).informarCampoSenha(senha);
	}

	@Quando("clicar no botao login")
	public void clicarNoBotaoLogin() {
		Na(LoginPage.class).acionarBotaoLogin();
	}

	@Entao("o sistema exibe a mensagem de usuario invalido")
	public void oSistemaExibeAMensagemDeUsuarioInvalido() {
//		assertEquals("Forgot your password? ", driver.findElement(By.id("app")).getText()); 
	}

	@Entao("o sistema exibe o usuario logado")
	public void oSistemaExibeOUsuarioLogado() {
//	   assertEquals(CVSOEKVROY, driver.findElement(By.id("CVSOE KVROY")).getText());
	}

}
