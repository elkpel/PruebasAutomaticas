package co.com.eafit.pageobject;

import java.util.List;

import cucumber.api.DataTable;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.*;

@DefaultUrl("http://www.eafit.edu.co/institucional/contacto/Paginas/contacto-eafit.aspx")
public class ContactenosEafitPage  extends PageObject {
			
	@FindBy(id = "Field1")
	public WebElementFacade txtNombre;

	@FindBy(id = "Field3")
	public WebElementFacade txtEmail;
	
	@FindBy(id = "Field4")
	public WebElementFacade txtTelefono;
	
	@FindBy(id = "Field5")
	public WebElementFacade txtCiudad;		
	
	
	@FindBy(id = "Field6")
	public WebElementFacade txtComentario;
	
	@FindBy(id = "saveForm")
	public WebElementFacade btnEnviar;		
	
	@FindBy(xpath = "//*[@id=\"container\"]/form/h2")
	public WebElementFacade lblMensaje;	
	
	public void nuevoComentario(DataTable dtDatos) {
		List<List<String>> data = dtDatos.raw();
		getDriver().switchTo().frame(0);	
		txtNombre.sendKeys(data.get(1).get(0));
		txtEmail.sendKeys(data.get(1).get(1));
		txtTelefono.sendKeys(data.get(1).get(2));
		txtCiudad.sendKeys(data.get(1).get(3));
		txtComentario.sendKeys(data.get(1).get(4));
		btnEnviar.click();
	}

	public void comentarioExitoso(String mensajeExitoso) {
		String strMensaje = lblMensaje.getText();
		assertThat(strMensaje, containsString(mensajeExitoso));	
	}
	
	
}
