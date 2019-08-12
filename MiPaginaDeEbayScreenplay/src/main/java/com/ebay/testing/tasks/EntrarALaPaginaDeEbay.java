package com.ebay.testing.tasks;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented; //statica
import net.serenitybdd.screenplay.actions.Open;

public class EntrarALaPaginaDeEbay implements Task{
	
	PageObject pagina;
	
	public EntrarALaPaginaDeEbay(PageObject pagina) {
		this.pagina = pagina;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Open.browserOn(pagina));
	}

	public static EntrarALaPaginaDeEbay En(PageObject paginadeinicio) {
		// TODO Auto-generated method stub
		return instrumented(EntrarALaPaginaDeEbay.class, paginadeinicio);
	}

}
