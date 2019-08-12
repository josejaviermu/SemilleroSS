package com.coppel.testing.screenplaycoppel.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.equalTo;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.coppel.testing.screenplaycoppel.models.LoginDatos;
import com.coppel.testing.screenplaycoppel.questions.LaRespuesta;
import com.coppel.testing.screenplaycoppel.questions.ResultadoInicioDeSesion;
import com.coppel.testing.screenplaycoppel.tasks.AbrirElNavegador;
import com.coppel.testing.screenplaycoppel.tasks.Autenticarse;
import com.coppel.testing.screenplaycoppel.tasks.EntrarAInicioDeSesion;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class LoginCoppelSteoDefinitions {
	
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
	
	@Given("^Mateo abre la pagina web coppel e ingresa al inicio de sesion$")
	public void mateoAbreLaPaginaWebCoppelEIngresaAlInicioDeSesion() throws Exception {
		Mateo.wasAbleTo(AbrirElNavegador.en());
		Mateo.wasAbleTo(EntrarAInicioDeSesion.encoppel());
	  
	}


	@When("^El ingresa los datos para iniciar sesion$")
	//lista de java utils
	public void elIngresaLosDatosParaIniciarSesion(List<LoginDatos> loginDatos) throws Exception {
		Mateo.attemptsTo(Autenticarse.enCoppel(loginDatos));
		//primer parametro como yo quiero que se llame
		//get 0 la primera vez que busque es 0 y el resto lo hace automaticamente
		Mateo.remember("respuesta", loginDatos.get(0).getExpected());
	}

	@Then("^El verifica el resultado esperado$")
	public void elVerificaElResultadoEsperado() throws Exception {
		Mateo.should(seeThat(ResultadoInicioDeSesion.enCoppel(), equalTo(Mateo.recall("respuesta"))));

	}

}
