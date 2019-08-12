package pe.pardoschicken.testing.ui;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.pardoschicken.pe")
public class PaginaDeInicioDePardosChicken extends PageObject{

	public static final Target presionarOrdenarAqui = Target.the("Botón Ordenar Aquí").located(By.xpath("//a[@class='ordenas_aqui']//img"));
	public static final Target seleccionarProducto = Target.the("Escoger producto").located(By.xpath("//div[@class='item-image-list']//div[2]//a[1]//div[1]//div[1]"));
	public static final Target ordenar =Target.the("Botón Ordenar").located(By.xpath("//a[@data-id='418b5210-ff25-11e8-9c64-2d46451cf10e']")) ;
	public static final Target agregarAMiOrden =Target.the("Botón Ordenar").located(By.xpath("//button[@id='addOrder']")) ;
	
	
//	public static final Target seleccionarCampoBusqueda =Target.the("Campo de busqueda").located(By.xpath("//div[@class='input-group hidden-sm-down input-group-search']//div//input[@placeholder='Busca productos']")) ;
//	public static final Target presionarBotonBuscar = Target.the("Botón buscar producto").located(By.xpath("//button[@class='btn btn-primary']"));
//	public static final Target seleccionarProducto = Target.the("Escoger producto").located(By.xpath("//div[@class='catalogue-container']//div[1]//a[1]//div[1]//figure[1]//picture[1]//img[1]"));
//	public static final Target productoAComprobar = Target.the("Texto del producto a escoger").located(By.cssSelector("#catalogue-product-container > div:nth-child(1) > a > div.detail-container > p > span"));
//	public static final Target productoParaComprobar = Target.the("Texto del producto escogido").located(By.xpath("//h1[@class='col-xs-12 col-md-9 col-lg-10']//span[contains(text(),'Televisor TCL LED 32 pulgadas Smart TV HD Android')]"));
}
