package mx.com.linio.testing.questions;

import static mx.com.linio.testing.ui.PaginaDeInicio.productoAComprobar;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import mx.com.linio.testing.tasks.Escoger;
import mx.com.linio.testing.ui.PaginaDeInicio;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class ComprobarTexto implements Question<String>{
	
	@Override
    public String answeredBy(Actor actor) {                   
 
		return Text.of(productoAComprobar).viewedBy(actor).asString();
    }  

    public static ComprobarTexto es() {              
        return new ComprobarTexto();
    }
	/*
    public <T extends Actor> void performAs(T actor) {
	
	actor.attemptsTo(Click.on(seleccionarProducto));
	}
	
	public static Escoger producto() {
		// TODO Auto-generated method stub
		return instrumented(Escoger.class);
	}

	@Override
	public static answeredBy(Actor actor) {
		// TODO Auto-generated method stub
		return null;
	}
    */
}
