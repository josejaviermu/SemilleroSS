package com.ebay.testing.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import com.ebay.testing.tasks.AgregaAlCarrito;
import com.ebay.testing.tasks.EntrarALaPaginaDeEbay;
import com.ebay.testing.tasks.EscribeLa;
import com.ebay.testing.tasks.Selecciona;
import com.ebay.testing.ui.PaginaDeInicioDeEbay;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class BuscarEnEbayStepsDefinitions {
	PaginaDeInicioDeEbay paginadeinicio;

	@Managed(driver = "chrome")
	WebDriver SuNavegador;
	
	Actor Jose = Actor.named("Jose");
	
	@Before
	public void setUp() {
		Jose.can(BrowseTheWeb.with(SuNavegador));
	}
	
	@Given("^Jose entro a Ebay$")
	public void joseEntroAEbay() throws Exception {
		Jose.attemptsTo(EntrarALaPaginaDeEbay.En(paginadeinicio)); 
	}


	@When("^Jose busca el producto \"([^\"]*)\"$")
	public void joseBuscaElProducto(String camara) throws Exception {
		Jose.attemptsTo(EscribeLa.palabra(camara));
	    
	}

	@When("^Jose selecciona la \"([^\"]*)\"$")
	public void joseSeleccionaLa(String camara) throws Exception {
		Jose.attemptsTo(Selecciona.la(camara));
	}

	@Then("^Jose agrega la \"([^\"]*)\" al carrito de compras$")
	public void joseAgregaLaAlCarritoDeCompras(String camara) throws Exception {
	   Jose.attemptsTo(AgregaAlCarrito.laCamara());
	}

}
