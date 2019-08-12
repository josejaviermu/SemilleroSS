package POMGoogle;

import org.junit.Test;

import static POMGoogle.Google.clicBotonDeBusqueda;
import static POMGoogle.Google.escribirEnElCampoDeBusqueda;
import static POMGoogle.Google.abrirGoogle;

public class ProbarPOMGoogle {

	@Test
	public void test() {
		abrirGoogle();
		escribirEnElCampoDeBusqueda("Sophos Solutions");
		clicBotonDeBusqueda();
		
	}
	
}
