package co.com.eafit.definitions;

import co.com.eafit.steps.ContactenosEafitSteps;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class ContactenosEafitDefinition {
	@Steps
	
	ContactenosEafitSteps contactenosEafitSteps;
	
	@Given("^que Yeison quiere escribir un comentario a la Universidad EAFIT$")
	public void queYeisonQuiereEscribirUnComentarioALaUniversidadEAFIT() throws Exception {
		contactenosEafitSteps.abrirPaginaEafit();
	}


	@When("^el diligencia el comentario$")
	public void elDiligenciaElComentario(DataTable dtDatos) throws Exception {
	    contactenosEafitSteps.diligenciarComentario(dtDatos);
	}

	@Then("^el visualiza el pantalla el mensaje (.*)\\.$")
	public void elVisualizaElPantallaElMensajeMuchasGraciasPorSuComentario(String MensajeExitoso) throws Exception {
		contactenosEafitSteps.comentarioEnviado(MensajeExitoso);
	}
	
}
