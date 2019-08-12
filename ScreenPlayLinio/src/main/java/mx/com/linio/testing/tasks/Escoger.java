package mx.com.linio.testing.tasks;

import static mx.com.linio.testing.ui.PaginaDeInicio.seleccionarProducto;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Click;


public class Escoger implements Task{

	
	@Override
	public <T extends Actor> void performAs(T actor) {
	
		actor.attemptsTo(Click.on(seleccionarProducto));
		
	}
	
	
	public static Escoger producto() {
		// TODO Auto-generated method stub
		return instrumented(Escoger.class);
	}

}
