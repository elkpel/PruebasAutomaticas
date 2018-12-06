package co.com.eafit.steps;

import co.com.eafit.pageobject.ContactenosEafitPage;
import cucumber.api.DataTable;
import net.thucydides.core.annotations.Step;

public class ContactenosEafitSteps {
	ContactenosEafitPage contactenosEafitPage;

	@Step
	public void abrirPaginaEafit() {
		contactenosEafitPage.open();		
	}

	@Step
	public void diligenciarComentario(DataTable dtDatos) {
		contactenosEafitPage.nuevoComentario(dtDatos);		
	}
	
	@Step
	public void comentarioEnviado(String mensajeExitoso) {
		contactenosEafitPage.comentarioExitoso(mensajeExitoso);		
	}
}
