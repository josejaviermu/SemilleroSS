package pe.pardoschicken.testing.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/java/pe/pardoschicken/testing/feature/BuscarEnPardosChicken.feature",
		glue = "pe.pardoschicken.testing.stepdefinitions",
		tags = "@BusquedaEnPardosChicken",
		snippets = SnippetType.CAMELCASE
		)

public class BuscarEnPardosChickenRunner {

}
