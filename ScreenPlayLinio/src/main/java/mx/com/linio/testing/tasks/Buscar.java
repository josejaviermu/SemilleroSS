package mx.com.linio.testing.tasks;

import org.openqa.selenium.Keys;

import mx.com.linio.testing.models.ReservarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import net.serenitybdd.screenplay.actions.Enter;

import static mx.com.linio.testing.ui.PaginaDeInicio.seleccionarCampoBusqueda;

public class Buscar implements Task{
	
	String busqueda;
	
	public Buscar(String busqueda) {
		this.busqueda = busqueda;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
	
	actor.attemptsTo(Enter.theValue(busqueda).into(seleccionarCampoBusqueda).thenHit(Keys.ENTER));
	}
	
	public static Buscar palabra(String busqueda) {
		
		return instrumented(Buscar.class, busqueda);
	}

}
