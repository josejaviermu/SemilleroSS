package prueba;

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

	static WebDriver robot;
    static ATUTestRecorder recorder;
	 static By seleccionarCampoBusqueda =By.xpath("//input[@name='q']");
	 static By presionarBotonBuscar = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']");        
	 static String navegadorAUtilizar = "webdriver.chrome.driver";
	 static String rutaEjecutableNavegador = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";
	 static By paginaAseleccionar = By.xpath("//cite[contains(text(),'https://www.atlnacional.com.co/')]");
	 static String ingresarConsulta = "wikipedia";
	 static By seleccionarOpcion = By.xpath("//a[contains(text(),'Inicio')]");
	 static String formatoFechaVideoYImagenes = "yy-MM-dd HH-mm-ss";
	 static String rutaParaGuardarVideo = "C:\\Selenium\\ScriptVideos";
	 static String rutaParaGuardarPantallazo = "C:\\Selenium\\Screenshot\\";
	 static String paginaInicialACargar = "https://www.google.com";
	 
	
	public static void abrirNavegador(String navegadorAUtilizar, String rutaEjecutableNavegador) {
			System.setProperty(navegadorAUtilizar, rutaEjecutableNavegador);
	}
	
	public static WebDriver CrearRobot() {
		robot = new ChromeDriver(); 
		return robot;
	}
	
	public static void paginaInicial(String paginaInicialACargar) {
		robot.get(paginaInicialACargar);
	}
	
	public static void campoBusquedaYTextoConsultar (By seleccionarCampoBusqueda, String ingresarConsulta ) {
		robot.findElement(seleccionarCampoBusqueda).sendKeys(ingresarConsulta);
	}
	
	public static void presionarBotonBusqueda(By presionarBotonBuscar) {
		robot.findElement(presionarBotonBuscar).click();
	}
	
	public static void seleccionarPagina(By paginaAseleccionar) {
		robot.findElement(paginaAseleccionar).click();
	}
	
	public static void seleccionarOpcionPagina(By seleccionarOpcion) {
		robot.findElement(seleccionarOpcion).click();
	}

	public static void iniciarGrabacionDeVideo() throws ATUTestRecorderException {
		//Declaración del formato de fecha
		DateFormat dateFormat = new SimpleDateFormat(formatoFechaVideoYImagenes);
		//Se Crea un objeto de fecha que representa la fecha y la hora actuales 
		Date date = new Date();
		//Declaracion test recorder, ruta de guardado y formato del video
		 recorder = new ATUTestRecorder(rutaParaGuardarVideo,"TestVideo-"+dateFormat.format(date), false);
		 recorder.start();
	}
	
	public static void detenerGrabacionDeVideo() throws ATUTestRecorderException {
		recorder.stop();
	}
	
	public static void tomarPantallazo(String formatoFechaVideoYImagenes, String rutaParaGuardarPantallazo) throws IOException {
		//declaración del formato de fecha
		DateFormat dateFormat = new SimpleDateFormat(formatoFechaVideoYImagenes);
		//se Crea un objeto de fecha que representa la fecha y la hora actuales 
		Date date = new Date();
		//se crea la variable de la captura de pantalla
	    File scrFile = ((TakesScreenshot)robot).getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(scrFile,new File(rutaParaGuardarPantallazo+dateFormat.format(date)+".png"));
	}
	
}
