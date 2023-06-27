package Banco.prueba;

import app_banco.modelos.Gestor;

public class PruebasGestor {

	public PruebasGestor() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Gestor gestor = new Gestor(1, "Saira", "12335" , "saira@correo.com"); 
	
		Gestor gestorB = new Gestor(); 
		
//		alternativa sin parámetros en el constructor
		gestorB.setId(2);
		gestorB.setUsuario("ana");
		gestorB.setPassword("123454");
		gestorB.setCorreo("ana@gmail.com");
		
		
		System.out.println(gestor);
		
		if(gestor.equals(gestorB)) {
			System.out.println("Son el mismo gestor");
		}else {
			System.out.println("Son gestores distintos");
		}
		
		}

	
	
	}





	

