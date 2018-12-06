package co.com.eafit.definitions;

import co.com.eafit.steps.LoginStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginDefinition {
	@Steps
	LoginStep	loginStep;

	@Given("^que Yeison quiere acceder a Metis$")
	public void queYeisonQuiereAccederAMetis() throws Exception {
		loginStep.AbrirPagina();
	}


	@When("^en escribe el usuario (.*) y la clave (.*)$")
	public void enEscribeElUsuarioDemoYLaClaveDemo(String user, String pass) throws Exception {
		loginStep.IngresarCredenciales(user, pass);
	}

	@Then("^el ve el mensaje de (.*)$")
	public void elVeElMensajeDeBootstrapAdminTemplate(String TituloPagina) throws Exception {
		loginStep.VerificarTitulo(TituloPagina);
	}
	
}
