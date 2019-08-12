package mx.com.linio.testing.runners;

import org.junit.runner.RunWith;

import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import cucumber.api.CucumberOptions;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/java/mx/com/linio/testing/feature/BuscarEnLinioConDataTable.feature",
		glue = "mx.com.linio.testing.stepdefinitions",
		tags = "@BusquedaEnLinio",
		snippets = SnippetType.CAMELCASE
		)

public class BuscarEnLinioConDataTableRunner {

}
