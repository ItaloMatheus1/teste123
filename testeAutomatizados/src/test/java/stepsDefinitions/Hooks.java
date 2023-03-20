package stepsDefinitions;

import static utils.Utils.*;

import pageObjects.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	@Before
	public void setUP() {
		acessarSistema();
		Na(LoginPage.class).realizarLogin("Admin", "admin123");
	}
	
	
	@Before(value = "@login")
	public void funcionalidadeLogin() {
		acessarSistema();
	}
	
	
	@After 
	public void tearDown() {
//		driver.quit();
	}
}

	
