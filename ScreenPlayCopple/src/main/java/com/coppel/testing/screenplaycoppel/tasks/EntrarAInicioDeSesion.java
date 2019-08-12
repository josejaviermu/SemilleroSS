package com.coppel.testing.screenplaycoppel.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.coppel.testing.screenplaycoppel.usersInterfaces.HomeCoppelComponentes;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EntrarAInicioDeSesion implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Click.on(HomeCoppelComponentes.INICIO_DE_SESION),
				Click.on(HomeCoppelComponentes.PESTAÑA_A_INICIO_DE_SESION));
	}

	public static EntrarAInicioDeSesion encoppel() {
		// TODO Auto-generated method stub
		return instrumented(EntrarAInicioDeSesion.class);
	}

}
