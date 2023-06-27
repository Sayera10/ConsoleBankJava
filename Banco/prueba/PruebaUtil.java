package Banco.prueba;
import java.util.ArrayList;
import java.util.List;

import app_banco.copia.Gestor;
import util.Utiles;
public class PruebaUtil {

	public PruebaUtil() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String nombreAleatorio =Utiles.nombreAleatorio(Utiles.NOMBRES,  Utiles.APELLIDOS);
		System.out.println(nombreAleatorio);
		
		nombreAleatorio = Utiles.nombreAleatorio();
		
		String [] nombres = {"Sayera" , "Musawer" ,"Ahmad" ,"Aneel"};
		String [] apellidos = {"Sayera" , "Musawer" ,"Ahmad" ,"Aneel"};
		
		nombreAleatorio = Utiles.nombreAleatorio(nombres, apellidos);
		
		System.out.println(nombreAleatorio);
	
		String correoAleatorio =Utiles.correoAleatorio();
		
		List<Gestor> gestores = new ArrayList<>();
		
		for(int i = 0; i < 10; i++ ) {
			String usuario = Utiles.nombreAleatorio();
			String correo= Utiles.correoAleatorio();
			Gestor gestor = new Gestor (i + 1, usuario, "" , correo);
			gestores.add(gestor);
		}
		System.out.println(gestores);

	}

}
