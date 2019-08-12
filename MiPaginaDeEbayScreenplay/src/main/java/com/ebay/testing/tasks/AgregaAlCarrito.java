package com.ebay.testing.tasks;

import static com.ebay.testing.ui.PaginaDeInicioDeEbay.BOTON_ANADIR_AL_CARRITO;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AgregaAlCarrito implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(BOTON_ANADIR_AL_CARRITO));
		
	}

	public static AgregaAlCarrito laCamara() {
		// TODO Auto-generated method stub
		return instrumented(AgregaAlCarrito.class);
	}

}
