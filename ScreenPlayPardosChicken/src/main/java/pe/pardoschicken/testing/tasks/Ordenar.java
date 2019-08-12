package pe.pardoschicken.testing.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static pe.pardoschicken.testing.ui.PaginaDeInicio.ordenar;
import static pe.pardoschicken.testing.ui.PaginaDeInicio.agregarAMiOrden;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class Ordenar implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
	
	actor.attemptsTo(Click.on(ordenar), Click.on(agregarAMiOrden));
	}
	

	public static Ordenar presionar() {
		// TODO Auto-generated method stub
		return instrumented(Ordenar.class);
	}


	public static Ordenar agregarAMiOrden() {
		return instrumented(Ordenar.class);
	}
}
