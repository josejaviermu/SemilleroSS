package mx.amazon.testing.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import mx.amazon.testing.ui.AmazonHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AgregaElArticulo implements Task {
	
	public AgregaElArticulo()  {
		
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Click.on(AmazonHomePage.ARTICULO_RESULTADO));
		actor.attemptsTo(Click.on(AmazonHomePage.BOTON_AGREGAR_AL_CARRITO));
	}

	public static AgregaElArticulo alCarrito() {
		return instrumented(AgregaElArticulo.class);
	}
	
	

}
