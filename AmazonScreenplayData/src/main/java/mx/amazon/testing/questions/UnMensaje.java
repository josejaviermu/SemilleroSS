package mx.amazon.testing.questions;

import mx.amazon.testing.ui.AmazonHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class UnMensaje implements Question <String>{

	@Override
	public String answeredBy(Actor actor) {
		return Text.of(AmazonHomePage.MENSAJE_RESULTADO).viewedBy(actor).asString();
	}

	public static UnMensaje queDice() {
		return new UnMensaje();
	}
	
	

}
