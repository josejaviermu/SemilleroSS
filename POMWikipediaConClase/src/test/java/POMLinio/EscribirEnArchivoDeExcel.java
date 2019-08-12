package POMLinio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class EscribirEnArchivoDeExcel {

	public EscribirEnArchivoDeExcel() {
		// TODO Auto-generated constructor stub
	}
	// Permite escribir una lista de datos al excel
	public static void escribirEnHojaDeExcel(String filepath, String sheetName, String[] dataToWrite) throws IOException {
		
		File file = new File(filepath);
		
		FileInputStream inputStream = new FileInputStream(file);
		// se crea el libro
		XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
		// se crea el objeto de la hoja
		XSSFSheet newSheet = newWorkbook.getSheet(sheetName);
		// el número de filas que existen para continuar y no sobreescribir
		int rowCount = newSheet.getLastRowNum() - newSheet.getFirstRowNum();
		// objeto fila tipo
		XSSFRow row = newSheet.getRow(0);
		// se crea al final de la fila
		XSSFRow newRow = newSheet.createRow(rowCount+1);
		for(int i=0; i<row.getLastCellNum(); i++) {
			// Se crea una nueva celda
			XSSFCell newCell = newRow.createCell(i);
			newCell.setCellValue(dataToWrite[i]);
		}
		inputStream.close();
		FileOutputStream outputStream = new FileOutputStream(file);
		newWorkbook.write(outputStream);
		outputStream.close();
	}
	// Permite crear un valor en una celda especifica
	public static void escribirValorEnLaCelda(String filepath, String sheetName, int rowNumber, int cellNumber, String resultText) throws IOException {
		File file = new File(filepath);
		FileInputStream inputStream = new FileInputStream(file);
		XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
		XSSFSheet newSheet = newWorkbook.getSheet(sheetName);
		// 
		XSSFRow row = newSheet.getRow(rowNumber);
		// se crea una nueva celda
		XSSFCell firstCell = row.getCell(cellNumber-1);
		// envia a consola el valor de la celda
		System.out.println("first cell value is:" + firstCell.getStringCellValue());
		// se crea otra celda
		XSSFCell nextCell = row.createCell(cellNumber);
		//
		nextCell.setCellValue(resultText);
		// se confirma que en la celda nextcell se esta guardando resultText
		System.out.println("next cell value:"+nextCell.getStringCellValue());
		inputStream.close();
		FileOutputStream outputStream = new FileOutputStream(file);
		newWorkbook.write(outputStream);
		outputStream.close();
	}
}
