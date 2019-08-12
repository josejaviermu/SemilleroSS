package com.google.testing.stepsdefinitions;

import org.openqa.selenium.WebDriver;

import com.google.testing.tasks.EntrarAGoogle;
import com.google.testing.ui.PaginaDeInicio;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class BuscarEnGoogleStepsDefinitions {
	PaginaDeInicio paginadeinicio;

	@Managed(driver = "chrome")
	WebDriver SuNavegador;
	
	Actor Adrian = Actor.named("Adrian");
	
	@Before
	public void setUp() {
		Adrian.can(BrowseTheWeb.with(SuNavegador));
	}
	
	@Given("Adrian entro a Google")
	public void adrianEntroAGoogle() {
		Adrian.attemptsTo(EntrarAGoogle.En(paginadeinicio));
	}

	@When("Adrian busca la palabra (.*)")
	public void adrianBuscaLaPalabra(String string) {
	}

	@Then("Adrian valida que el titulo de la ventana contenga la palabra (.*)")
	public void adrianValidaQueElTituloDeLaVentanaContengaLaPalabra(String string) {
	}

}
