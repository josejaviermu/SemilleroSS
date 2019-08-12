package mx.com.linio.testing.models;

public class ReservarProducto {

	private String producto;
	
	private String estado;
	
	public String obtenerProducto() {
		return producto;
	}
	
	public void colocarProducto(String producto) {
		this.producto = producto;
	}
	
	public String obtenerEstado() {
		return estado;
	}
	
	public void colocarEstado(String estado) {
		this.estado = estado;
	}
}
