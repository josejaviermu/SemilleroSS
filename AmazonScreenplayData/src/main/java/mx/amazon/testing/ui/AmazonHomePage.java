package mx.amazon.testing.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.amazon.com.mx/")
public class AmazonHomePage extends PageObject {
	
	public static final Target OPCION_INICIAR = Target.the("Opcion Iniciar").locatedBy("//span[contains(text(),'Hola, Identifícate')]");
	public static final Target CAMPO_CORREO = Target.the("Campor Correo electrónico").locatedBy("//input[@id='ap_email']");
	public static final Target CAMPO_CONTRASENA = Target.the("Campo contraseña").locatedBy("//input[@id='ap_password']");
	public static final Target BOTON_INICIAR_SESION = Target.the("Boton Iniciar sesión").locatedBy("//input[@id='signInSubmit']");
	public static final Target BARRA_BUSQUEDA = Target.the("Barra de Búsqueda").locatedBy("//input[@id='twotabsearchtextbox']");
	
	public static final Target MENSAJE_RESULTADO = Target.the("Mensaje Resultado").locatedBy("//span[@id='confirm-text']");
	public static final Target BOTON_BUSCAR = Target.the("Boton iniciar búsqueda").locatedBy("//div[@class='nav-search-submit nav-sprite']//input[@class='nav-input']");
	public static final Target ARTICULO_RESULTADO = Target.the("Resultado búsqueda artículo").locatedBy("//div[@class='s-result-list s-search-results sg-row']//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[1]//div[1]//span[1]//a[1]//div[1]//img[1]");
	public static final Target BOTON_AGREGAR_AL_CARRITO = Target.the("Boton agregar al carrito").locatedBy("//input[@id='add-to-cart-button']");
	public static final Target PRODUCTO_AGREGADO = Target.the("Producto Agregado").locatedBy("//span[@class='a-size-medium sc-product-title a-text-bold']");
	public static final Target CARRITO_DE_COMPRA = Target.the("Carrito de Compra").locatedBy("//span[contains(text(),'Carrito')]");
		
			
	
	

}
