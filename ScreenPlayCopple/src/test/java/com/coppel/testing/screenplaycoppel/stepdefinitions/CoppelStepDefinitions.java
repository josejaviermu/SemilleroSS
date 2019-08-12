package com.coppel.testing.screenplaycoppel.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;

import com.coppel.testing.screenplaycoppel.questions.LaRespuesta;
import com.coppel.testing.screenplaycoppel.tasks.AbrirElNavegador;
import com.coppel.testing.screenplaycoppel.tasks.IngresarAlCarritoDeCompras;
import com.coppel.testing.screenplaycoppel.tasks.SeleccionarPantalla;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static org.hamcrest.Matchers.equalTo;

public class CoppelStepDefinitions {
	
	//para inicialzar el driver
	@Managed(driver = "chrome")
	WebDriver SuNavegador;
	
	//Es el que va a ejecutar todo por medio de las tareas
	private Actor Mateo = Actor.named("Mateo");
	
	@Before
	public void setUp() {
		//browsertheweb habilidad
		Mateo.can(BrowseTheWeb.with(SuNavegador));
		
	}
	
	@Given("^Mateo abre la pagina web coppel$")
	public void mateoAbreLaPaginaWebCoppel() throws Exception {
		//Precondiciones
		Mateo.wasAbleTo(AbrirElNavegador.en());
		}


	@When("^Mateo busca la imagen de pantallas y agrega el producto al carrito de compras$")
	public void mateoBuscaLaImagenDePantallasYAgregaElProductoAlCarritoDeCompras() throws Exception {
		//Condiciones
		Mateo.attemptsTo(SeleccionarPantalla.enCoppel());
		Mateo.attemptsTo(IngresarAlCarritoDeCompras.enCoppel());
	}

	@Then("^valida que el producto seleccionado este en el carrito de compras$")
	public void mateoValidaQueElTextoDelCarritoDeComprasSeaElProductoSeleccionado() throws Exception {
		//Consecuencias
		Mateo.should(seeThat(LaRespuesta.en(), equalTo("Pantalla LED Hisense 50\" Ultra HD 4K Smart TV 50H6D")));
	}
}
