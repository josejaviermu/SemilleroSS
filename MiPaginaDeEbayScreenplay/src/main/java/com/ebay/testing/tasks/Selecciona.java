package com.ebay.testing.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static com.ebay.testing.ui.PaginaDeInicioDeEbay.SELECCIONAR_CAMARA;

import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Selecciona implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(SELECCIONAR_CAMARA));
		
	}

	public static Selecciona la(String camara) {
		
		return instrumented(Selecciona.class);
	}

}
