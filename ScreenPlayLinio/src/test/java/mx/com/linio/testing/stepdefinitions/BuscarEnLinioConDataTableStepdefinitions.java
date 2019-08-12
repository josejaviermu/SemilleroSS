package mx.com.linio.testing.stepdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.containsString;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mx.com.linio.testing.exception.ResultadoNoEsperado;
import mx.com.linio.testing.models.ReservarProducto;
import mx.com.linio.testing.questions.ComprobarTexto;
import mx.com.linio.testing.questions.ResultadoDelaBusqueda;
import mx.com.linio.testing.tasks.Buscar;
import mx.com.linio.testing.tasks.BuscarDe;
import mx.com.linio.testing.tasks.EntrarALinio;
import mx.com.linio.testing.ui.PaginaDeInicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class BuscarEnLinioConDataTableStepdefinitions {

	@Managed(driver = "chrome")
	private WebDriver ElNavegador;
	
	private Actor robot = Actor.named("robot");
	
	private PaginaDeInicio paginaDeInicio;
	
	@Before()
	public void beforeEscenario() {
		System.out.print("Precondición para realizar la prueba, background");
		robot.can(BrowseTheWeb.with(ElNavegador));
	}
	
	@After()
	public void afterEscenario() {
		System.out.print("Condición para terminar la prueba, background");
	}
		
	@Given("^Robot entro a Linio$")
	public void robotEntroALinio() {
	   robot.wasAbleTo(EntrarALinio.a(paginaDeInicio));
	}


	@When("^El busca el producto en la pagina$")
	public void elBuscaElProductoEnLaPagina(List<ReservarProducto> producto) {
	    robot.attemptsTo(BuscarDe.laDataTable(producto));
	    robot.remember("respuesta", producto.get(0).obtenerEstado());
	}

	@Then("^El verifica el resultado esperado$")
	public void elVerificaElResultadoEsperado() {
	    robot.should(seeThat(ComprobarTexto.es(), containsString(robot.recall("respuesta"))).orComplainWith(ResultadoNoEsperado.class, "Producto no encontrado"));
	}
	
}
