package com.coppel.testing.screenplaycoppel.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.coppel.testing.screenplaycoppel.usersInterfaces.HomeCoppelComponentes;
import com.coppel.testing.screenplaycoppel.usersInterfaces.ListTvPage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarPantalla implements Task{


	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(HomeCoppelComponentes.PANTALLAS),
				Click.on(ListTvPage.BOTON_COMPRAR),Click.on(ListTvPage.BOTON_COMPRAR_EMERGENTE));
		
	}

	public static SeleccionarPantalla enCoppel() {
		// TODO Auto-generated method stub
		return instrumented(SeleccionarPantalla.class);
	}

}
