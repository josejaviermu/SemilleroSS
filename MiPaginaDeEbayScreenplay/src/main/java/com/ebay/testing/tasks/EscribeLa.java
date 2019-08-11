package com.ebay.testing.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import static com.ebay.testing.ui.PaginaDeInicioDeEbay.CAMPO_DE_BUSQUEDA;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

public class EscribeLa implements Task {
	String escribir;
	
	public EscribeLa(String escribir) {
		this.escribir = escribir;
	}
	

	@Override
	public <T extends Actor> void performAs(T actor) {
	
	actor.attemptsTo(Enter.theValue(escribir).into(CAMPO_DE_BUSQUEDA).thenHit(Keys.ENTER));
	}

	public static EscribeLa palabra(String escribir) {
		
		return instrumented(EscribeLa.class,escribir);
	}

}
