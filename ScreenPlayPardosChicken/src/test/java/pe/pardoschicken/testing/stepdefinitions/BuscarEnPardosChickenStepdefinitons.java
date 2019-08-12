package pe.pardoschicken.testing.stepdefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
//import mx.com.linio.testing.ui.PaginaDeInicio;
//import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
//import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Managed;
import pe.pardoschicken.testing.tasks.EntrarAPardosChicken;
import pe.pardoschicken.testing.tasks.EscogerComida;
import pe.pardoschicken.testing.tasks.Ordenar;
import pe.pardoschicken.testing.tasks.PresionarBotonOrdenarAqui;
import pe.pardoschicken.testing.ui.PaginaDeInicioDePardosChicken;
import pe.pardoschicken.testing.ui.PaginaDeInicio;

public class BuscarEnPardosChickenStepdefinitons {

	@Managed(driver = "Chrome")
	WebDriver SuNavegador;
	
	private PaginaDeInicioDePardosChicken paginaDeInicio; 
	
	Actor bot = Actor.named("bot");

	@Before
	public void setUp() {
		bot.can(BrowseTheWeb.with(SuNavegador));
		System.out.println("Hola");
		SuNavegador.manage().window().maximize();
		System.out.println("Aquí estoy");
	}
	
	@Given("^Bot entra a pardoschicken$")
	public void botEntraAPardoschicken() 
	{
		System.out.println("aquí");
		bot.wasAbleTo(EntrarAPardosChicken.a(paginaDeInicio));
		System.out.println("tambn");
	}


	@When("^El busca una \"([^\"]*)\" en la pagina$")
	public void elBuscaUnaEnLaPagina(String palabra)  {
		bot.attemptsTo(PresionarBotonOrdenarAqui.presionar());
		bot.attemptsTo(EscogerComida.presionar());
		bot.attemptsTo(Ordenar.presionar());
		bot.attemptsTo(Ordenar.agregarAMiOrden());
		//bot.wait(5000);
		//bot.attemptsTo(Buscar.palabra(palabra));
	    
	}

	@Then("^El verifica el resultado esperado$")
	public void elVerificaElResultadoEsperado()  {
	   
	}
	
}
