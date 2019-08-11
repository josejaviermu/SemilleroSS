package mx.amazon.testing.stepdefinitions;

import static org.hamcrest.Matchers.equalTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mx.amazon.testing.questions.EnLosResultados;
import mx.amazon.testing.task.AbreElNavegador;
import mx.amazon.testing.task.AgregaElArticulo;
import mx.amazon.testing.task.Busca;
import mx.amazon.testing.task.Ingresa;
import mx.amazon.testing.ui.AmazonHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class ComprarEnAmazonStepdefinitions {
	
	@Managed(driver = "chrome")
	private WebDriver suNavegador;
	
	private Actor Pepito = Actor.named("Pepito");
	
	private AmazonHomePage paginaAmazon;
	
	@Before
	public void setUp() {
		Pepito.can(BrowseTheWeb.with(suNavegador));
	}
	
	@Given("^pepito entro a amazon$")
	public void pepitoEntroAAmazon() throws Exception {
		
		Pepito.wasAbleTo(AbreElNavegador.en(paginaAmazon));
		Pepito.wasAbleTo(Ingresa.usuarioYContrasena());

	}


	@When("^pepito busca un \"([^\"]*)\" y lo agrega a su carrito$")
	public void pepitoBuscaUnYLoAgregaASuCarrito(String producto) throws Exception {
		Pepito.attemptsTo(Busca.elArticulo(producto));
		Pepito.attemptsTo(AgregaElArticulo.alCarrito());
	}

	@Then("^pepito puede ver el \"([^\"]*)\" en la lista de compra$")
	public void pepitoPuedeVerElEnLaListaDeCompra(String producto) throws Exception {
		Pepito.should(seeThat(EnLosResultados.laPalabra(), equalTo(producto)));
	}


}
