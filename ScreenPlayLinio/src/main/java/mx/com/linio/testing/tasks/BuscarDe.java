package mx.com.linio.testing.tasks;

import static mx.com.linio.testing.ui.PaginaDeInicio.seleccionarCampoBusqueda;
import static mx.com.linio.testing.ui.PaginaDeInicio.presionarBotonBuscar;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import org.openqa.selenium.Keys;

import mx.com.linio.testing.models.ReservarProducto;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class BuscarDe implements Task{

	private List<ReservarProducto> producto;
	

	public BuscarDe(List<ReservarProducto> producto) {
		this.producto = producto;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
	
	actor.attemptsTo(Enter.theValue(producto.get(0).obtenerProducto()).into(seleccionarCampoBusqueda), Click.on(presionarBotonBuscar));
	}
	
	public static BuscarDe laDataTable(List<ReservarProducto> producto) {
		
		return instrumented(BuscarDe.class, producto);
	}

}
