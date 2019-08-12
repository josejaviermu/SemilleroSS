package com.coppel.testing.screenplaycoppel.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.coppel.testing.screenplaycoppel.usersInterfaces.HomeCoppel;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Step;;

//utilizar implemments task
public class AbrirElNavegador implements Task {

	@Override
	//esto es del informe, {0} referencia a el actor
	@Step("{0} Abre el navegador de coppel en la pagina de inicio")
	//Acciones que el actor va a ejecutar y el performas ejecuta tareas
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new HomeCoppel()));
		
	}

	public static AbrirElNavegador en() {
		//instrument de la clase task para crear una instancia
		return instrumented(AbrirElNavegador.class);
	}

}
