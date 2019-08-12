package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Coneccion {

	private static Connection cn;
	
	public static Connection obtenerConeccion() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			cn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=","SemilleroSS","sophos.2019");
		} catch (Exception e) {
			cn = null;
		}
		return cn;
	}
	
	public static void main(String[] args) throws SQLException {
		Connection pruebaCn = Coneccion.obtenerConeccion();
		if(pruebaCn != null) {
			System.out.println("Conectado");
			System.out.println(pruebaCn);
			Statement stm = pruebaCn.createStatement();
			ResultSet rst = stm.executeQuery("select * from persona");
			while(rst.next()) {
				System.out.println("Id: "+rst.getInt(1)+" Nombres: "+rst.getString(2)+" Apellidos: "+rst.getString(3));
			}
		}
		else {
			System.out.println("Desconectado");
		}
	}
}
