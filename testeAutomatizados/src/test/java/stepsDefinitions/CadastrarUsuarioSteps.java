package stepsDefinitions;

import static org.junit.Assert.assertTrue;
import static utils.Utils.*;
import static utils.Utils.driver;

import org.openqa.selenium.By;

import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.CadastrarUsuarioPage;
import pageObjects.TelaInicialPage;

public class CadastrarUsuarioSteps {

	@Quando("eu acionar a aba admin")
	public void euAcionarAAbaAdmin() {
		  Na(TelaInicialPage.class).acionarAbaadmin();
	}

	@Quando("acionar o botao add")
	public void acionarOBotaoAdd() {
	   Na(TelaInicialPage.class).acionarBotaoAdd();
	}

	@Quando("informar o campo Employer Name {string}")
	public void informarOCampoEmployerName() {
		Na(CadastrarUsuarioPage.class).clicarBotaoAdmin();
	}

	@Quando("informar o campo Username {string}")
	public void informarOCampoUsername(String userName) {
		Na(CadastrarUsuarioPage.class).informarCampoUserName(userName);
	}

	@Quando("informar o campo Password {string}")
	public void informarOCampoPassword(String senha) {
		Na(CadastrarUsuarioPage.class).informarCampoConfirmarPassword(senha);
	}

	@Quando("informar o campo Confirm Password {string}")
	public void informarOCampoConfirmPassword(String senha) {
		Na(CadastrarUsuarioPage.class).informarCampoConfirmarPassword(senha);
	}
	@Quando("acionar o botao salvar")
	public void acionarOBotaoSalvar() {
		Na(CadastrarUsuarioPage.class).acionarBotaoSalvar();
	}
	
	@Entao ("^o sistema cadastar o usuario")
	public void oSistemaCadastraroUsuario(String userName) {
	    assertTrue(driver.findElement(By.xpath("//div[contains(.,'"+userName+"')])[13]")).isDisplayed());
	}
	
}
		

