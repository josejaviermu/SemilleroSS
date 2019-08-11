package mx.amazon.testing.questions;

import mx.amazon.testing.ui.AmazonHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class EnLosResultados  implements Question <String>{
	
	public EnLosResultados() {
		
	}

	@Override
	public String answeredBy(Actor actor) {
		AmazonHomePage pagina = new AmazonHomePage();
		return pagina.element("//span[@class='a-size-medium sc-product-title a-text-bold']").getText();
	}

	public static EnLosResultados laPalabra() {
		return new EnLosResultados();
	}
	
	

}
