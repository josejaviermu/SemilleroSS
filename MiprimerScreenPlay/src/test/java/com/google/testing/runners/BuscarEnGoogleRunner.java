package com.google.testing.runners;

import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(features = “src/test/java/com/Google/testing/features/BuscarEngoogle.feature”, glue = ”com.google.testing.stepdefinitions”, snippets = SnippetType.CAMELCASE)

public class BuscarEnGoogleRunner {

}

