package com.google.testing.tasks;

import com.google.testing.ui.PaginaDeInicio;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class EntrarAGoogle implements Task{
	
	PageObject pagina;
	
	public EntrarAGoogle(PageObject pagina) {
		this.pagina = pagina;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Open.browserOn(pagina));
	}

	public static Performable En(PageObject paginadeinicio) {
		// TODO Auto-generated method stub
		return Tasks.instrumented(EntrarAGoogle.class, paginadeinicio);
	}

}
