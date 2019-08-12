package POMLinio;

import static POMLinio.Utilidades.ingresarConsulta;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
/*
import atu.testrecorder.ATUTestRecorder;
import atu.testrecorder.exceptions.ATUTestRecorderException;
*/
/*
import static POMLinio.LeerArchivoDeExcel.leerHojaDeExcel;
import static POMLinio.LeerArchivoDeExcel.obtenerValorDelaCelda;
import static POMLinio.EscribirEnArchivoDeExcel.escribirEnHojaDeExcel;
import static POMLinio.EscribirEnArchivoDeExcel.escribirValorEnLaCelda;
*/
public class Utilidades {

	static LeerArchivoDeExcel leerArchivo;
	static EscribirEnArchivoDeExcel escribirArchivo;
	static String rutaArchivoDeExcel = "C:\\Users\\semillero\\Desktop\\Test.xlsx";
	static String textoABuscar;
	static String textoAEscribir;
	
	static WebDriver bot;
//	static ATUTestRecorder recorder;	
	
	static By seleccionarCampoBusqueda =By.xpath("//div[@class='input-group hidden-sm-down input-group-search']//div//input[@placeholder='Busca productos']");
        
	static String navegadorAUtilizar = "webdriver.chrome.driver";
	static String rutaEjecutableNavegador = "C:\\Selenium\\chromedriver_win32\\chromedriver.exe";

	static String ingresarConsulta = "Sombrero";
	
	static By seleccionarOpcion = By.xpath("//div[@class='catalogue-container']//div[1]//a[1]//div[1]//figure[1]//picture[1]//img[1]");
	
	static By presionarBotonBuscar = By.xpath("//button[@class='btn btn-primary']");
	static String formatoFechaVideoEImagenes = "yy-MM-dd HH-mm-ss";
	static String rutaParaGuardarVideo = "C:\\Selenium\\VideosTest";
	static String rutaParaGuardarPantallazo = "C:\\Selenium\\ImagenTest";
	static String paginaInicialACargar = "https://www.linio.com.mx/";
	static String ingresarBusqueda = "automatización de pruebas";
	static By seleccionarCampoParaBusqueda = By.xpath("//input[@id='searchInput']");

	static By presionarBotonParaBuscar = By.xpath("div[@class='catalogue-container']//div[1]//a[1]//div[1]//figure[1]//picture[1]//img[1]");
	
	static By seleccionarCampoAgregarAlCarrito = By.xpath("//div[@class='product-bg-container product-general-info variation-info']//button[1]");
	
	static By seleccionarCampoIrAlCarrito = By.xpath("//a[@class='btn btn-sm btn-go-to-cart']");
	
	static By xpath = By.xpath("//h1[@class='col-xs-12 col-md-9 col-lg-10']");
	
	public static void abrirNavegador() {
		System.setProperty(navegadorAUtilizar, rutaEjecutableNavegador);
	}
	
	public static WebDriver crearRobot() {
		bot = new ChromeDriver();
		return bot;
	}
	
	public static void paginaInicial() {		
		bot.get(paginaInicialACargar);
	}
	
	public static void leerCeldaDeExcel() throws IOException {
		leerArchivo = new LeerArchivoDeExcel();
		textoABuscar = leerArchivo.obtenerValorDelaCelda(rutaArchivoDeExcel, "Hoja2", 5, 0);
	}	
	
	public static void escribirEnCeldaDeExcel(String textoAEscribir) throws IOException {
		escribirArchivo = new EscribirEnArchivoDeExcel();
		escribirArchivo.escribirValorEnLaCelda(rutaArchivoDeExcel, "Hoja2", 5, 1, textoAEscribir);
	}
	
	public static void campoBusquedaYTextoAConsultar() {
		bot.findElement(seleccionarCampoBusqueda).sendKeys(textoABuscar);
		bot.findElement(seleccionarCampoBusqueda).sendKeys(Keys.RETURN);
	}
	
	public static void presionarBotonBusqueda() {
		bot.findElement(presionarBotonBuscar).click();
	}

	
	public static void seleccionarOpcionPagina() throws IOException {
		
		boolean elementoNoEncontrado = bot.findElements(By.xpath("//div[@class='no-results-icon']")).size() > 0;
		System.out.println(elementoNoEncontrado);
		if(elementoNoEncontrado == true) {
			String noHayProducto = "No se tiene producto en el inventario";
			escribirEnCeldaDeExcel(noHayProducto);
		}
		else {
		bot.findElement(seleccionarOpcion).click();
		}
	}
	
	public static void buscarEnLaPagina(By seleccionarCampoParaBusqueda, String ingresarBusqueda) {
		bot.findElement(seleccionarCampoParaBusqueda).sendKeys(ingresarBusqueda);
	}
	
	public static void presionarBotonParaBusqueda(By presionarBotonParaBuscar) {
		bot.findElement(presionarBotonParaBuscar).click();
	}
	
	public static void clickNombre() {
		bot.findElement(xpath).click();
	}
	
	public static String obtenerTextoParaComprobar() {
		By getText = By.xpath("//h1[@class='col-xs-12 col-md-9 col-lg-10']//span[contains(@itemprop,'name')]");
		
		ingresarConsulta = bot.findElement(getText).getText();
		
		return ingresarConsulta;
	}
	
	public static void seleccionarCampoAgregarAlCarrito() {
				
		//Boolean espera = bot.findElements(By.xpath("//div[@class='dy-modal-contents']")).size() > 0;
		//Boolean espera = bot.findElements(By.xpath("//div[class='dy-modal-container dy-act-overlay']")).size() > 0;
		Boolean espera = bot.findElements(By.cssSelector("div.dy-modal-container")).size() > 0;
		System.out.println(espera);
		
		if(espera == true) {
			//bot.findElement(By.className("dy-ly-close")).click();
			//bot.findElement(By.className("//div[class='dy-modal-wrapper']")).click();
			bot.findElement(By.cssSelector("div.dy-lb-close")).click();
			espera = bot.findElements(By.cssSelector("div.dy-lb-close")).size() > 0;
			System.out.println(espera);
		}

		Boolean isPresent;
		isPresent = bot.findElements(By.xpath("//h4[@class='variation-title']")).size() > 0;
		System.out.println(isPresent);
		if(isPresent == false) {
			bot.findElement(seleccionarCampoAgregarAlCarrito).click();
		}
		else {
			
			bot.findElement(By.xpath("//label[contains(@for,'option-1')]")).click();
			bot.findElement(seleccionarCampoAgregarAlCarrito).click();
		}
		
	}
	
	public static void seleccionarCampoIrAlCarrito() {
		bot.findElement(seleccionarCampoIrAlCarrito).click();
		/*
		//controla el tienpo de espera
		WebDriverWait wait = new WebDriverWait(bot, 30);
		//almaceno un elemento web
		WebElement elementoWeb;
		elementoWeb = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//iframe[contains(@id,'fancybox-frame')]")));
		
		bot.switchTo().frame(elementoWeb);
		//en el marco del iframe hecemos click en agregar al carrito
		bot.findElement(By.xpath("//button[@id='addToCart']")).click();
		*/
	}
	
	public static void cerrarNavegador() {
		bot.quit();
	}
	
	/*
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
	*/
	
}
