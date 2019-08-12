package SeleniumJavaFrameworkTestNG;

import java.sql.Driver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class HolaMundo {
/*
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}  */
	
	private WebDriver driver;
	
	@BeforeTest
	public void setUpTest() {
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@Test
	public void googleSearch() {
		//goto google.com
//		driver.get("https://www.google.com");
		//enter text in search textbox
//		driver.findElement(By.name("q")).sendKeys("Hola Mundo");
		//click on search button
//		driver.findElement(By.name("btnk")).sendKeys(Keys.RETURN);
			
		driver.get("http://www.google.com"); 
		//Selecciona el elemento a interactuar
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("lo que sea");
		//Dar click
		driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']//input[@name='btnK']")).click();
	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
		driver.quit();
		System.out.println("Test Completed Successfully");
	}

}
