package POMWikipediaConClase;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;

public class Utilidades {
	
	static WebDriver bot;
	static ATUTestRecorder recorder;	
	static By seleccionarCampoBusqueda =By.xpath("//input[@name='q']");
	static By presionarBotonBuscar = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']");        
	static String navegadorAUtilizar = "webdriver.chrome.driver";
	static String rutaEjecutableNavegador = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
	static By paginaASeleccionar = By.xpath("//cite[contains(text(),'https://www.wikipedia.org/')]");
	static String ingresarConsulta = "wikipedia";
	static By seleccionarOpcion = By.xpath("//input[@id='searchInput']");
	static String formatoFechaVideoEImagenes = "yy-MM-dd HH-mm-ss";
	static String rutaParaGuardarVideo = "C:\\Selenium\\VideosTest";
	static String rutaParaGuardarPantallazo = "C:\\Selenium\\ImagenTest";
	static String paginaInicialACargar = "https://www.google.com";
	static String ingresarBusqueda = "automatización de pruebas";
	static By seleccionarCampoParaBusqueda = By.xpath("//input[@id='searchInput']");
	static By presionarBotonParaBuscar = By.xpath("//button[@class='pure-button pure-button-primary-progressive']");
	
	public static void abrirNavegador(String driverNavegador, String rutaEjecutableNavegador) {
		System.setProperty(driverNavegador, rutaEjecutableNavegador);
	}
	
	public static WebDriver crearRobot() {
		bot = new ChromeDriver();
		return bot;
	}
	
	public static void paginaInicial(String paginaInicialACargar) {
		bot.get(paginaInicialACargar);
	}
	
	public static void campoBusquedaYTextoAConsultar(By seleccionarCampoBusqueda, String ingresarConsulta) {
		bot.findElement(seleccionarCampoBusqueda).sendKeys(ingresarConsulta);
	}
	
	public static void presionarBotonBusqueda(By presionarBotonBuscar) {
		bot.findElement(presionarBotonBuscar).click();
	}

	public static void seleccionarPagina(By paginaASeleccionar) {
		bot.findElement(paginaASeleccionar).click();
	}
	
	public static void seleccionarOpcionPagina(By selccionarOpcion) {
		bot.findElement(selccionarOpcion).click();
	}
	
	public static void buscarEnLaPagina(By seleccionarCampoParaBusqueda, String ingresarBusqueda) {
		bot.findElement(seleccionarCampoParaBusqueda).sendKeys(ingresarBusqueda);
	}
	
	public static void presionarBotonParaBusqueda(By presionarBotonParaBuscar) {
		bot.findElement(presionarBotonParaBuscar).click();
	}
	
	public static void iniciargrabaciondeVideo() throws ATUTestRecorderException {
		DateFormat dateFormat = new SimpleDateFormat(formatoFechaVideoEImagenes);
		Date date = new Date();
		recorder = new ATUTestRecorder(rutaParaGuardarVideo, "TestVideo-"+dateFormat.format(date),false);
		recorder.start();
	}
	
	public static void detenerGrabacionDeVideo() throws ATUTestRecorderException {
		recorder.stop();
	}
	
	public static void tomarPantallazo(String formatoFechaVideoEImagenes, String rutaParaGuardarPantallazo) throws IOException {
		DateFormat dateFormat = new SimpleDateFormat(formatoFechaVideoEImagenes);
		Date date = new Date();
		File scrFile =((TakesScreenshot)bot).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File(rutaParaGuardarPantallazo+dateFormat.format(date)+".png"));
	}
}
