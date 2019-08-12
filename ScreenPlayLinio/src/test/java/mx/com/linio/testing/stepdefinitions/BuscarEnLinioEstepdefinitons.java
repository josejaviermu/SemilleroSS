package mx.com.linio.testing.stepdefinitions;

import org.openqa.selenium.WebDriver;

//import com.google.testing.tasks.EntrarAGoogle;
//import static net.serenitybdd.screenplay.GivenWhenThen.*;
//import static org.hamcrest.Matchers.hasItems;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.contains;


import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import mx.com.linio.testing.tasks.Buscar;
import mx.com.linio.testing.tasks.EntrarALinio;
import mx.com.linio.testing.tasks.Escoger;
import mx.com.linio.testing.ui.PaginaDeInicio;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import static mx.com.linio.testing.ui.PaginaDeInicio.productoAComprobar;
import static mx.com.linio.testing.ui.PaginaDeInicio.productoParaComprobar;
import mx.com.linio.testing.questions.ComprobarTexto;
public class BuscarEnLinioEstepdefinitons {


		@Managed(driver = "Chrome")
		WebDriver SuNavegador;
		
		private PaginaDeInicio paginaDeInicio; 
		
		Actor bot = Actor.named("bot");

//		@Before
//		public void setUp() {
//			bot.can(BrowseTheWeb.with(SuNavegador));
//			SuNavegador.manage().window().maximize();
//		}
		
		@Given("Bot entro a Linio$")
		public void bot_entro_a_Linio() throws Exception {
			bot.can(BrowseTheWeb.with(SuNavegador));
			SuNavegador.manage().window().maximize();
			bot.wasAbleTo(EntrarALinio.a(paginaDeInicio));
		}

		@When("el busca la palabra \"([^\"]*)\"$")
		public void bot_busca_la_palabra(String string) {
		   bot.attemptsTo(Buscar.palabra(string));
		}
		/*
		@And("el escoge el \"([^\"]*)\"$")
		public void el_escoge_el(String string) {
			bot.attemptsTo(Escoger.producto());
			}  */
		
		@Then("el valida que la busqueda contenga la palabra \"([^\"]*)\"$")
		public void bot_valida_que_la_busqueda_contenga_la_palabra(String string) {
		    //bot.should(seeThat(ComprobarTexto.es(), equalTo(productoParaComprobar)));
			
			bot.should(seeThat(ComprobarTexto.es(), equalTo("televisor")));
		}

}
