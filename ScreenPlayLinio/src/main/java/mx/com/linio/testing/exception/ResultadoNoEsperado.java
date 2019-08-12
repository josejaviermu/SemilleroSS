package mx.com.linio.testing.exception;

public class ResultadoNoEsperado extends AssertionError{

	public ResultadoNoEsperado(String mensaje) {
		super(mensaje);
	}
	
	public ResultadoNoEsperado(String mensaje, Throwable causa) {
		super(mensaje, causa);
	}
}
