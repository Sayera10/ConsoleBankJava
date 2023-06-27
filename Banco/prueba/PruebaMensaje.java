package Banco.prueba;

import app_banco.copia.Cliente;

public class PruebaMensaje {

	public PruebaMensaje() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Cliente client = new Cliente(2, 23, "Saira", "12335" , "saira@correo.com", 100); 
		Cliente clientB = new Cliente(12, 18, "wafa" , "632618", "wafa@correo.com", 100 ); 
		Cliente clientC = new Cliente();
		clientC.setId(2);
		
		clientC.setPassword("123454");
		clientC.setCorreo("ana@gmail.com");
		clientC.setSaldo(0);
	}

}

