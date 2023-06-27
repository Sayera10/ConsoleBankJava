package util;

import java.util.Random;

public class Utiles {

	public static final String[] NOMBRES = { "Sayera", "Musawer", "Ahmad", "Aneel" };
	public static final String[] APELLIDOS = { "Sayera", "Musawer", "Ahmad", "Aneel" };
	public static final String[] USUARIOS = { "Sayera", "Musawer", "Ahmad", "Aneel" };
	public static final String[] DOMINIOS = { "gmail.com", "outlook.com", "gmail.com", "outlook.com" };

	public static String nombreAleatorio(String[] nombres, String[] apellidos) {
		Random random = new Random();
		int indiceNombre = random.nextInt(nombres.length);
		String nombre = nombres[indiceNombre];

		int indiceApellidos = random.nextInt(apellidos.length);
		String apellido = apellidos[indiceApellidos];

		return nombre + " " + apellido;

	}

	public static String nombreAleatorio() {
		return nombreAleatorio(NOMBRES, APELLIDOS);
	}

	public static String correoAleatorio(String[] correos) {
		Random random = new Random();
		int indiceCorreo = random.nextInt(correos.length);
		
		return correos[indiceCorreo];
		

	}
	public static String correoAleatorio(String[] usuarios, String[] dominios) {
		Random random = new Random();
		int indiceUsuario = random.nextInt(usuarios.length);
		String usuario = usuarios[indiceUsuario];
		
		int indiceDominios = random.nextInt(dominios.length);
		String dominio = usuarios[indiceDominios];
		
		return usuario.toLowerCase() + " . " + "@"	+ dominio + ".com";
	}
	public static String correoAleatorio() {
		return nombreAleatorio(USUARIOS, DOMINIOS);
	}
}
