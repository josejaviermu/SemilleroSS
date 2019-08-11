package mx.amazon.testing.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import mx.amazon.testing.ui.AmazonHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Busca implements Task {
	
	String articulo;
	
	public Busca(String articulo) {
		this.articulo = articulo;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Enter.theValue(articulo).into(AmazonHomePage.BARRA_BUSQUEDA));
		actor.attemptsTo(Click.on(AmazonHomePage.BOTON_BUSCAR));
		
	}

	public static Busca elArticulo(String articulo) {
		// TODO Auto-generated method stub
		return instrumented(Busca.class, articulo);	}
	
	

}
