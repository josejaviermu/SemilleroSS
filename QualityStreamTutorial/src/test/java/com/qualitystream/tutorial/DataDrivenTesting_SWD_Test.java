package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DataDrivenTesting_SWD_Test {

	private WebDriver driver;
	private WriteExcelFile writeFile;
	private ReadExcelFile readFile;
	private By searchBoxLocator = By.id("search_query_top");
	private By searchBtnLocator = By.name("submit_search");
	private By resultTextLocator = By.cssSelector("span.heading-counter");
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		writeFile = new WriteExcelFile();
		readFile = new ReadExcelFile();
		
		driver.get("http://automationpractice.com");
	}

	@After
	public void tearDown() throws Exception {
		driver.quit();
	}

	@Test
	public void test() throws IOException {
		//ruta donde está el documento de Excel
		String filepath = "C:\\Users\\semillero\\Desktop\\Test.xlsx";
		// termino que se va a buscar, para este caso la fila 0 y columna 0 de la hoja1
		String searchText = readFile.getCellValue(filepath, "Hoja1", 0, 0);
		// Donde se va a buscar en la página y que se va a buscar
		driver.findElement(searchBoxLocator).sendKeys(searchText);
		driver.findElement(searchBtnLocator).click();
		//resultado buscado, pa este caso es el texto del número de los elementos buscados
		String resultText = driver.findElement(resultTextLocator).getText();
		// confirmación de lo que está devolviendo
		System.out.println("Page result text:"+resultText);
		//leer lo que está en el excel antes de escribir
		readFile.readExcel(filepath, "Hoja1");
		//Se escribe el resultado encontrado en la fila 0 y columna 1 de la hoja 1
		writeFile.writeCellValue(filepath, "Hoja1", 0, 1, resultText);
		//leer lo que está en elexcel despues de escribir
		readFile.readExcel(filepath, "Hoja1");
		
	}

}
