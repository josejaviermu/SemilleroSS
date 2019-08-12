package pe.pardoschicken.testing.tasks;

import static pe.pardoschicken.testing.ui.PaginaDeInicio.presionarOrdenarAqui;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class PresionarBotonOrdenarAqui implements Task{
	


//	String busqueda;
//	
//	public PresionarBotonOrdenarAqui(String busqueda) {
//		this.busqueda = busqueda;
//	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
	
	actor.attemptsTo(Click.on(presionarOrdenarAqui));
	}
	

	public static PresionarBotonOrdenarAqui presionar() {
		// TODO Auto-generated method stub
		return instrumented(PresionarBotonOrdenarAqui.class);
	}


}
