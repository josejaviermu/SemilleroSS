package mx.amazon.testing.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import mx.amazon.testing.ui.AmazonHomePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Ingresa implements Task {

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AmazonHomePage.OPCION_INICIAR));
		actor.attemptsTo(Enter.theValue("joselito.and@gmail.com").into(AmazonHomePage.CAMPO_CORREO));
		actor.attemptsTo(Enter.theValue("123456Aa").into(AmazonHomePage.CAMPO_CONTRASENA));
		actor.attemptsTo(Click.on(AmazonHomePage.BOTON_INICIAR_SESION));
	}

	public static Ingresa usuarioYContrasena() {
		return instrumented(Ingresa.class);
	}
	
	
	
	

}
