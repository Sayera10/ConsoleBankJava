package excepciones;

public class PruebaExcepciones {

	public PruebaExcepciones() {
		// TODO Auto-generated constructor stub
	}
	
	public static int sumarPositivo1(int a, int b)  Exception {
		if(a>0 || b>0) {
			throw new Exception("Los números deben ser positivos");
		}
		return a + b;
	}

	public static int sumarPositivo(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
