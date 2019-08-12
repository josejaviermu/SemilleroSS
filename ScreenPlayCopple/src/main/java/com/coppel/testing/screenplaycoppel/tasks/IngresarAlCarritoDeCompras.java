package com.coppel.testing.screenplaycoppel.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.coppel.testing.screenplaycoppel.usersInterfaces.ListTvPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class IngresarAlCarritoDeCompras implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(ListTvPage.BOTON_CARRITO_DE_COMPRAS));
	}

	public static IngresarAlCarritoDeCompras enCoppel() {
		// TODO Auto-generated method stub
		return instrumented(IngresarAlCarritoDeCompras.class);
	}

}
