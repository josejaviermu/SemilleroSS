package com.google.testing.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/com/google/testing/"
		+ "features/BuscarEnGoogle.feature",glue = "com.google.testing"
				+ ".stepsdefinitions", snippets = SnippetType.CAMELCASE)
public class BuscarEnGoogleRunner {
	
}
