package POMLinio;

import static org.junit.Assert.*;

import static org.hamcrest.CoreMatchers.*;

import static POMLinio.Utilidades.crearRobot;
import static POMLinio.Utilidades.abrirNavegador;
import static POMLinio.Utilidades.paginaInicial;
import static POMLinio.Utilidades.campoBusquedaYTextoAConsultar;
import static POMLinio.Utilidades.presionarBotonBusqueda;
//import static POMLinio.Utilidades.seleccionarPagina;
import static POMLinio.Utilidades.seleccionarOpcionPagina;
//import static POMLinio.Utilidades.tomarPantallazo;
//import static POMLinio.Utilidades.buscarEnLaPagina;
//import static POMLinio.Utilidades.presionarBotonParaBusqueda;
//import static POMLinio.Utilidades.clickNombre;
import static POMLinio.Utilidades.leerCeldaDeExcel;
import static POMLinio.Utilidades.escribirEnCeldaDeExcel;
import static POMLinio.Utilidades.cerrarNavegador;
import static POMLinio.Utilidades.obtenerTextoParaComprobar;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

//import static POMLinio.Utilidades.iniciargrabaciondeVideo;
//import static POMLinio.Utilidades.detenerGrabacionDeVideo;
//import static POMLinio.Utilidades.seleccionarCampoIrAlCarrito;

//import static POMLinio.Utilidades.navegadorAUtilizar;
//import static POMLinio.Utilidades.paginaInicialACargar;
//import static POMLinio.Utilidades.rutaEjecutableNavegador;
//import static POMLinio.Utilidades.seleccionarCampoBusqueda;
import static POMLinio.Utilidades.ingresarConsulta;
//import static POMLinio.Utilidades.presionarBotonBuscar;
//import static POMLinio.Utilidades.paginaASeleccionar;
import static POMLinio.Utilidades.seleccionarOpcion;
import static POMLinio.Utilidades.formatoFechaVideoEImagenes;
import static POMLinio.Utilidades.rutaParaGuardarPantallazo;
import static POMLinio.Utilidades.ingresarBusqueda;
import static POMLinio.Utilidades.seleccionarCampoParaBusqueda;
import static POMLinio.Utilidades.presionarBotonParaBuscar;
import static POMLinio.Utilidades.seleccionarCampoAgregarAlCarrito;
import static POMLinio.Utilidades.seleccionarCampoIrAlCarrito;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

//import atu.testrecorder.exceptions.ATUTestRecorderException;

public class LinioPOM {

	private WebDriver robot;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		abrirNavegador();
		robot = crearRobot();
	}

	@After
	public void tearDown() throws Exception {
//		detenerGrabacionDeVideo();
		cerrarNavegador();
	}
	
	@Test
	public void test() throws IOException //throws ATUTestRecorderException {
//		iniciargrabaciondeVideo();
	{	robot.manage().window().maximize();
		paginaInicial();
		leerCeldaDeExcel();
		campoBusquedaYTextoAConsultar();
//		presionarBotonBusqueda();
		robot.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	
		seleccionarOpcionPagina();
		
		ingresarConsulta  = obtenerTextoParaComprobar();
		
	//	By getText = By.xpath("//h1[@class='col-xs-12 col-md-9 col-lg-10']//span[contains(@itemprop,'name')]");
		
	//	ingresarConsulta = robot.findElement(getText).getText();
		
		System.out.println(ingresarConsulta);
		
		seleccionarCampoAgregarAlCarrito();
		robot.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
		seleccionarCampoIrAlCarrito();
		
		By validacion = By.xpath("//body/div[contains(@class,'wrapper wrapper-no-footer container-fluid')]/main[@class='container-fluid container-semi-fluid']/div/div[@class='row']/div[@class='cart-item-section col-lg-9 col-xs-12']/div[@class='cart-item row']/div[@class='cart-item row']/div[@class='item-title col-md-12 col-sm-11 col-xs-10']/span[1]");
		
		String comprobarConsulta = robot.findElement(validacion).getText();
		System.out.println(validacion);
		System.out.println(comprobarConsulta);
		escribirEnCeldaDeExcel(comprobarConsulta);
	
		assertThat("mensaje comprobado con exito", ingresarConsulta, is(comprobarConsulta));

	}

}
