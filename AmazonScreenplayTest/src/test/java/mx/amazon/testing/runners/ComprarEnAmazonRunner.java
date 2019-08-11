package mx.amazon.testing.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features = "src/test/resources/features/mx_amazon.feature",
		glue = "mx.amazon.testing.stepdefinitions",
		snippets = SnippetType.CAMELCASE)
public class ComprarEnAmazonRunner {

}
