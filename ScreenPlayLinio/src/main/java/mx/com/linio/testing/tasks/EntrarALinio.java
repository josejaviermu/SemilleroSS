package mx.com.linio.testing.tasks;

//import com.gargoylesoftware.htmlunit.Page;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
//import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.screenplay.actions.Open;

public class EntrarALinio implements Task{

	private PageObject paginaWeb;
	
	public EntrarALinio(PageObject paginaWeb) {
		this.paginaWeb = paginaWeb;
	}
	
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		System.out.println("Carga del Navegador");
		actor.attemptsTo(Open.browserOn(paginaWeb));
		System.out.println("Carga de la Página");
		
	}


	public static EntrarALinio a(PageObject paginaWeb) {
		return instrumented(EntrarALinio.class, paginaWeb);
	}
	


}
