package pe.pardoschicken.testing.tasks;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import pe.pardoschicken.testing.ui.PaginaDeInicio;
//import pe.pardoschicken.testing.ui.PaginaDeInicioDePardosChicken;
import pe.pardoschicken.testing.ui.PaginaDeInicioDePardosChicken;


public class EntrarAPardosChicken implements Task{

private PageObject paginaWeb;
	
	public EntrarAPardosChicken(PageObject paginaWeb) {
		this.paginaWeb = paginaWeb;
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("Carga del Navegador");
		actor.attemptsTo(Open.browserOn(paginaWeb));
		System.out.println("Carga de la Página");
		
	}


	public static EntrarAPardosChicken a(PageObject paginaWeb) {
		return instrumented(EntrarAPardosChicken.class, paginaWeb);
	}

//	public static EntrarAPardosChicken a(PageObject paginaWeb) {
//		return instrumented(EntrarAPardosChicken.class, paginaWeb);
//	}
}
