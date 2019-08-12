package com.coppel.testing.screenplaycoppel.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

//nos dice que ejecutara un test con junit
@RunWith(CucumberWithSerenity.class)
//que es lo que vamos a ejecutar los festures y los definition
//feature es un archivo, stepdefinitions es todo el paquete,
@CucumberOptions(features = "src\\test\\resources\\features\\LoginCoppel.feature",
				 glue = "com.coppel.testing.screenplaycoppel.stepdefinitions",
				 snippets = SnippetType.CAMELCASE)

public class LoginCoppelRunner {

}
