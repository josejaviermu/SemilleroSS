package POMGoogle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Google {

	static WebDriver Chrome;
	static By campoDeBusqueda = By.xpath("//input[@name='q']");
	static By botonDeBusqueda = By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']");
	
	public static void escribirEnElCampoDeBusqueda(String CadenaABuscar) {
		Chrome.findElement(campoDeBusqueda).sendKeys(CadenaABuscar);
	}
	
	public static void clicBotonDeBusqueda() {
		Chrome.findElement(botonDeBusqueda).click();
	}
	
	public static void abrirGoogle(){
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		Chrome = new ChromeDriver();
		Chrome.manage().window().maximize();
		Chrome.get("https://www.google.com");
	}
	
}
