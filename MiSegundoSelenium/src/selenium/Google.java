package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Crea el comando que controla el navegador
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver Jose = new ChromeDriver();
		//Ir a la url
		Jose.get("http://www.google.com"); 
		//Selecciona el elemento a interactuar
		Jose.findElement(By.xpath("//input[@name='q']")).sendKeys("lo que sea");
		//Dar click
		Jose.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
		//Cerrar
		Jose.quit();
		
	}

}