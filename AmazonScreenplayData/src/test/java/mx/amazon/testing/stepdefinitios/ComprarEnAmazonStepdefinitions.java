package mx.amazon.testing.stepdefinitios;

import static org.hamcrest.Matchers.equalTo;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import org.openqa.selenium.WebDriver;
import java.util.List;
import cucumber.api.DataTable;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mx.amazon.testing.questions.UnMensaje;
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


	@When("^el busca un (.*) y lo agrega a su carrito$")
	public void elBuscaUnYLoAgregaASuCarrito(String articulo, DataTable datos) throws Exception {

		List<String> lista = datos.asList(String.class);
		articulo = lista.get(1);
		Pepito.attemptsTo(Busca.elArticulo(articulo));
		Pepito.attemptsTo(AgregaElArticulo.alCarrito());

	}

	@Then("^el puede ver el un mensaje indicando que el producto se agrego$")
	public void elPuedeVerElUnMensajeIndicandoQueElProductoSeAgrego() throws Exception {
		Pepito.should(seeThat(UnMensaje.queDice(), equalTo("1 producto agregado al carrito")));
	//	Pepito.should(seeThat(UnMensaje.queDice(), equalTo("1 producto agregado al carrito")).orComplainWith(null)));
	}

}
