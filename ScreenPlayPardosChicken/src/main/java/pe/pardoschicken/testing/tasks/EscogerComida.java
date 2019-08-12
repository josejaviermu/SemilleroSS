package pe.pardoschicken.testing.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static pe.pardoschicken.testing.ui.PaginaDeInicio.seleccionarProducto;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class EscogerComida implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
	
	actor.attemptsTo(Click.on(seleccionarProducto));
	}
	

	public static EscogerComida presionar() {
		// TODO Auto-generated method stub
		return instrumented(EscogerComida.class);
	}
	

}
