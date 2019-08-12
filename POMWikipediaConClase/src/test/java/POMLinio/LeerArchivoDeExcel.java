package POMLinio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class LeerArchivoDeExcel {

	//Constructor por defecto
	public LeerArchivoDeExcel() {
			// TODO Auto-generated constructor stub
	}
	// Método general, permite leer la hoja de Excel
	public static void leerHojaDeExcel(String filepath, String sheetName) throws IOException {
			// Donde esta guardado
			File file = new File(filepath);
			FileInputStream inputStream = new FileInputStream(file);
			// se crea el objeto donde se guarda el libro de Excel
			XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
			// se crea el objeto donde se guarda la hoja con que se trabaja
			XSSFSheet newSheet = newWorkbook.getSheet(sheetName);
			// se guarda en la variable el número de filas que tiene el Excel
			int rowCount = newSheet.getLastRowNum() + newSheet.getFirstRowNum();
			//
			for(int i=0; i<rowCount; i++) {
			// objeto que lee fila por fila de la hoja
				XSSFRow row = newSheet.getRow(i);
				// se itera sobre todas las celdas de la fila
				for(int j=0; j<row.getLastCellNum(); j++) {
				// muestra en consola el valor de la celda
					System.out.println(row.getCell(j).getStringCellValue()+"||");
				}
			}
	}
	// Método para leer una casilla de la Hoja
	public static String obtenerValorDelaCelda(String filepath, String sheetName, int rowNumber, int cellNumber) throws IOException {
		
		File file = new File(filepath);
		
		FileInputStream inputStream = new FileInputStream(file);
		
		XSSFWorkbook newWorkbook = new XSSFWorkbook(inputStream);
		
		XSSFSheet newSheet = newWorkbook.getSheet(sheetName);
		// obtiene el número de la fila
		XSSFRow row = newSheet.getRow(rowNumber);
		// el número de la celda
		XSSFCell cell = row.getCell(cellNumber);
		// Regresa el valor que está en esa casilla 
		return cell.getStringCellValue();
	}
}
