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
		actor.attemptsTo(Click.on(AmazonHomePage.CARRITO_DE_COMPRA));
	}

	public static AgregaElArticulo alCarrito() {
		// TODO Auto-generated method stub
		return instrumented(AgregaElArticulo.class);
	}
	
	

}
