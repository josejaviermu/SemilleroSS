package GradleWikipediaConClase;

import java.io.File;
import java.text.DateFormat;
import java.util.Date;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

//import Selenium.ATUTestRecorder;
//import Selenium.ATUTestRecorderException;

//import Selenium.IOException;
//import Selenium.TakesScreenshot;

public class Utilidades {

	static WebDriver robot;
//	ATUTestRecorder recorder;
//	DateFormat dateFormat;
//	Date date;
	//static WebDriverException yo = new WebDriverException();
	
	static String paginaInicialACargar = "https://www.google.com";
	
	public static WebDriver abrirNavegador(String driver, String rutacondriver) {
		// expecifica donde está
		System.setProperty(driver, rutacondriver);
		// lo inicializa y crea los objetos
		
		robot = new ChromeDriver();
		return robot;
	}
	
	public static void paginaInicial() {
		robot.get(paginaInicialACargar);
	}
	
/*	
	public void buscarElemento(String xpat, WebDriver yo) {
		yo.findElement(By.xpath(xpat));
	}
	
	public void digitar(String xpat, String busqueda, WebDriver yo) {
		yo.findElement(By.xpath(xpat)).sendKeys(busqueda);
	}
	
	public void hacerClick(String xpat, WebDriver yo) {
		yo.findElement(By.xpath(xpat)).click();
	}
	
	public void tomarFoto(String rutadeAlmacenamiento, int numero, WebDriver yo) throws IOException {
		File img = ((TakesScreenshot)yo).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(img, new File(rutadeAlmacenamiento+"img"+numero+".png"));
	}
	
	public void grabarVideo(String rutaAlmacenamiento, String nombreVideo) throws ATUTestRecorderException {
		//crea objeto de ATUTestRecorder
		//Proporciona la ruta para guardar videos y el formato del nombre del archivo 
		recorder = new ATUTestRecorder(rutaAlmacenamiento,nombreVideo,false);
				
		//inicia la grabación
		recorder.start();
	}
	
	public void terminarVideo() throws ATUTestRecorderException {
		recorder.stop();
	}
	
	public void cerrarNavegador(WebDriver yo) {
		yo.quit();
	}
	*/
}


