package mx.amazon.testing.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import mx.amazon.testing.ui.AmazonHomePage;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;;

public class AbreElNavegador implements Task {
	
	public AbreElNavegador(PageObject pagina) {
	}
	
	//
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(Open.browserOn(new AmazonHomePage()));
	}

	public static AbreElNavegador en(PageObject pagina) {
		return instrumented(AbreElNavegador.class, pagina);
	}

}
