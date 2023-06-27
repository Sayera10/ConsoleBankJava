package excepciones;

import java.util.Scanner;

public class MainExcepciones {

	public MainExcepciones() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un numero: ");
		
		try {
			int numeroEntero = teclado.nextInt();
			System.out.println("Número * 2 = " + numeroEntero * 2);
		}catch(Exception e) {
			System.out.print("No se puedo leer ningún número...");
			e.printStackTrace();
		}finally {
			teclado.close();
		}
		
		try {
		int suma = PruebaExcepciones.sumarPositivo(0,0);
		System.out.println("Resultado: " + suma);
		
	}catch(Exception e) {
		e.printStackTrace();
	}

	}
}
