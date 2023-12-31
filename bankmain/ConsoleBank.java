package bankmain;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import app_banco.modelos.Cliente;
import app_banco.modelos.Gestor;
import app_banco.modelos.Mensaje;
import app_banco.modelos.Transferencia;
import util.Utiles;

public class ConsoleBank {

	private List<Cliente> clientes;
	private List<Gestor> gestores;
	private List<Mensaje> mensajes;
	private List<Transferencia> transferencias;

	private Integer siguienteIdGestor;
	private Integer siguienteIdCliente;
	private Integer siguienteIdMensaje;
	private Integer siguienteIdTransferencia;

	private Scanner teclado;

	ConsoleBank() {

		this.gestores = new ArrayList<>();
		this.clientes = new ArrayList<>();
		this.mensajes = new ArrayList<>();
		this.transferencias = new ArrayList<>();

		this.siguienteIdGestor = 1;
		this.siguienteIdCliente= 1;
		this.siguienteIdMensaje= 1;
		this.siguienteIdTransferencia= 1;
		

		this.teclado = new Scanner(System.in);

	}

	private void mostrarMenu() {

		System.out.println("1. Insertar gestor");

		System.out.println("2. Insertar gestores de prueba");

		System.out.println("3. Consultar Gestor");

		System.out.println("4. Ver todos los gestores");

		System.out.println("5. Actualizar Gestores");

		System.out.println("6. Eliminar gestores");

		System.out.print("7. Insertar cliente");

		System.out.print("8. Consultar cliente");

		System.out.println("9. Ver todos los clientes");

		System.out.println("10. Actualizar Cliente");

		System.out.println("11. Eliminar cliente");

		System.out.print("12. Consultar Mensaje");

		System.out.println("13. Ver todos los mensajes");

		System.out.print("14. Insertar mensaje");

		System.out.println("15.consultar tranferencia");

		System.out.println("16. Ver todas las transferencias");

		System.out.print("17. Insertar transferencia");

		System.out.print("18. Iniciar seccion como gestor");

		System.out.println("0. Salir\n");

	}

	private void insertarGestor() {

		System.out.println("Nombre: ");

		String nombre = teclado.next();

		System.out.println("Correo: ");

		String email = teclado.next();

		System.out.println("Contraseña: ");

		String password = teclado.next();

		System.out.println("Oficina: ");

		String oficina = teclado.next();

		Gestor nuevoGestor = new Gestor(siguienteIdGestor, nombre, password, email, "Valencia");

		gestores.add(nuevoGestor);

		siguienteIdGestor++;

		System.out.println("¡Gestor creado con exito!");

	}

	private void insertarGestoresDePrueba() {

		System.out.println("Número de gestores: ");

		int numeroGestores = teclado.nextInt();

		for (int i = 0; i < 10; i++) {

			String usuario = Utiles.nombreAleatorio();

			String correo = Utiles.correoAleatorio();

			Gestor gestor = new Gestor(siguienteIdGestor, usuario, " ", correo, "Valencia");

			gestores.add(gestor);

			siguienteIdGestor++;

		}

	}

	private void consultarGestor() {

		System.out.println("Id del gestor a consultar: ");

		int idGestor = teclado.nextInt();

		Gestor gestorResultado = buscarGestorPorId(idGestor);

		if (gestorResultado != null) {

			System.out.println(gestorResultado);

		} else {

			System.out.println("No se puedo encontrar el gestor" + idGestor);

		}

	}

	private Gestor buscarGestorPorId(int idGestor) {

		Gestor gestorResultado = null;

		for (int i = 0; i < gestores.size(); i++) {

			Gestor gestor = gestores.get(i);

			if (gestor.getId() == idGestor) {

				gestorResultado = gestor;

				return gestorResultado;

			}

		}

		return null;

	}

	private Cliente buscarClientePorId(int idCliente) {

		Cliente clienteResultado = null;

		for (int i = 0; i < clientes.size(); i++) {

			Cliente cliente = clientes.get(i);

			if (cliente.getId() == idCliente) {

				clienteResultado = cliente;

				return clienteResultado;

			}

		}

		return null;

	}

	private void verTodosLosGestores() {

		if (gestores.isEmpty()) {

			System.out.println("Todavia no hay gestores.");

		}

		gestores.forEach(gestor -> {

			System.out.println(gestor);

		});

	}

	private void actualizarGestor() {
		System.out.println("Id del gestor a actualizacion: ");

		int idGestor = teclado.nextInt();

		Gestor gestorResulatado = buscarGestorPorId(idGestor);

		if (gestorResulatado != null) {

			System.out.println("[n] Nombre ");

			System.out.println("[e] Email ");

			System.out.println("[c] Contraseña ");

			System.out.println("[o] Oficina ");

			System.out.println("[x] Cancelar ");

			System.out.println("Campo a actualizar: ");

			char opcionActualizar = teclado.next().charAt(0);

			switch (opcionActualizar) {

			case 'n':

				System.out.println("Nombre: ");

				String nombre = teclado.next();

				gestorResulatado.setUsuario(nombre);

				break;

			case 'e':

				System.out.println("Email: ");

				String email = teclado.next();

				gestorResulatado.setCorreo(email);

				break;

			case 'c':

				System.out.println("Contraseña: ");

				String password = teclado.next();

				gestorResulatado.setPassword(password);

				break;

			case 'o':

				System.out.println("Oficina: ");

				String oficina = teclado.next();

				gestorResulatado.setUsuario(oficina);

				break;

			case 'x':

				System.out.println("Cancelar actualización... ");

				break;

			default:

				System.out.println("Opcion no valida");

			}

			if (opcionActualizar != 'x') {

				System.out.println("Se actualizó el gestor con el id" + idGestor);

			}

		} else {

			System.out.println("No se puedo encontrar el gestor" + idGestor);

		}

	}

	private void eliminarGestor() {
		System.out.println("Id del gestor a eliminar: ");

		int idGestor = teclado.nextInt();

		Gestor gestorResultado = null;

		int posicionGestor = -1;

		for (int i = 0; i < gestores.size(); i++) {

			Gestor gestor = gestores.get(i);

			if (gestor.getId() == idGestor) {

				gestorResultado = gestor;

				posicionGestor = i;

				break;

			}

		}

		if (gestorResultado != null) {

			gestores.remove(posicionGestor);

			System.out.println("Se elimino el gestor con el id" + idGestor);

		} else {

			System.out.println("No se puedo encontrar el gestor" + idGestor);

		}

	}

	private void insertarCliente() {

		System.out.println("Nombre: ");

		String nombre = teclado.next();

		System.out.println("Correo: ");

		String email = teclado.next();

		System.out.println("Contraseña: ");

		String password = teclado.next();

		System.out.print("saldo");

		Double saldo = teclado.nextDouble();

		Cliente nuevoCliente = new Cliente(siguienteIdCliente, nombre, password, email, saldo, 1);

		clientes.add(nuevoCliente);


		siguienteIdCliente++;

		System.out.println("¡Cliente creado con exito!");

	}

	private void consultarCliente() {

		System.out.println("Id del Cliente a consultar: ");

		int idCliente = teclado.nextInt();

		Cliente clienteResultado = buscarClientePorId(idCliente);

		if (clienteResultado != null) {

			System.out.println(clienteResultado);

		} else {

			System.out.println("No se puedo encontrar el cliente" + idCliente);

		}
	}

	private void verTodosLosCliente() {

		if (clientes.isEmpty()) {

			System.out.println("Todavia no hay clientes");

		}

		clientes.forEach(clientes -> {

			System.out.println(clientes);
		});

	}

	private void actualizarCliente() {
		System.out.println("Id del cliente a actualizacion: ");

		int idCliente = teclado.nextInt();

		Cliente clienteResulatado = buscarClientePorId(idCliente);

		if (clienteResulatado != null) {

			System.out.println("[n] Nombre ");

			System.out.println("[e] Email ");

			System.out.println("[c] Contraseña ");

			System.out.println("[o] Oficina ");

			System.out.println("[x] Cancelar ");

			System.out.println("Campo a actualizar: ");

			char opcionActualizar = teclado.next().charAt(0);

			switch (opcionActualizar) {

			case 'n':

				System.out.println("Nombre: ");

				String nombre = teclado.next();

				clienteResulatado.setUsuario(nombre);

				break;

			case 'e':

				System.out.println("Email: ");

				String email = teclado.next();

				clienteResulatado.setCorreo(email);

				break;

			case 'c':

				System.out.println("Contraseña: ");

				String password = teclado.next();

				clienteResulatado.setPassword(password);

				break;

			case 'o':

				System.out.println("Oficina: ");

				String oficina = teclado.next();

				clienteResulatado.setUsuario(oficina);

				break;

			case 'x':

				System.out.println("Cancelar actualización... ");

				break;

			default:

				System.out.println("Opcion no valida");

			}

			if (opcionActualizar != 'x') {

				System.out.println("Se actualizó el cliente con el id" + idCliente);

			}

		} else {

			System.out.println("No se puedo encontrar el cliente" + idCliente);

		}

	}

	private void eliminarCliente() {
		System.out.println("Id del cliente a eliminar: ");

		int idCliente = teclado.nextInt();

		Cliente clienteResultado = null;

		int posicionCliente = -1;

		for (int i = 0; i < clientes.size(); i++) {

			Cliente cliente = clientes.get(i);

			if (cliente.getId() == idCliente) {

				clienteResultado = cliente;

				posicionCliente = i;

				break;

			}

		}

		if (clienteResultado != null) {

			clientes.remove(posicionCliente);

			System.out.println("Se elimino el clienete con el id" + idCliente);

		} else {

			System.out.println("No se puedo encontrar el clienete" + idCliente);

		}

	}

	private void login() {
		System.out.print("Id gestor: ");
		int idGestor = teclado.nextInt();
		System.out.print("Contraseña: ");
		String pass = teclado.next();
		Gestor gestor = buscarGestorPorId(idGestor);
		if (gestor != null) {
			if (gestor.getPassword().equals(pass)) {
				System.out.println("Login correcto");
			} else {
				System.out.println("Login incorrecto!");
			}

		} else {
			System.out.println("El usuario no existe....");
		}

	}

	private void consultarMensaje() {

		System.out.println("Id del mensaje a consultar: ");

		int idMensaje = teclado.nextInt();

		Mensaje mensajeResultado = buscarMensajePorId(idMensaje);

		if (mensajeResultado != null) {

			System.out.println(mensajeResultado);

		} else {

			System.out.println("No se puedo encontrar el mensaje" + idMensaje);

		}

	}

	private void verTodosLosMensaje() {

		if (mensajes.isEmpty()) {

			System.out.println("Todavia no hay mensajes");

		}

		mensajes.forEach(mensajes -> {

			System.out.println(mensajes);
		});

	}

	private Mensaje buscarMensajePorId(int idMensaje) {
		Mensaje mensajeResultado = null;

		for (int i = 0; i < mensajes.size(); i++) {

			Mensaje mensaje = mensajes.get(i);

			if (mensaje.getId() == idMensaje) {

				mensajeResultado = mensaje;

				return mensajeResultado;

			}

		}

		return null;
	}

	private void insertarMensaje() {

		System.out.println("mensaje: ");

		String mensaje = teclado.next();

		System.out.print("idOrigin");

		Integer idOrigin = teclado.nextInt();

		System.out.println("idDestino ");

		Integer idDestino = teclado.nextInt();

		Mensaje nuevoMensaje = new Mensaje(siguienteIdMensaje, idOrigin, idDestino, mensaje);

		mensajes.add(nuevoMensaje);


		siguienteIdMensaje++;

		System.out.println("¡Mensaje creado con exito!");

	}

	private void consultarTransferencia() {

		System.out.println("Id del transferencia a consultar: ");

		int idTransferencia = teclado.nextInt();

		Transferencia transferenciaResultado = buscarTransferenciaPorId(idTransferencia);

		if (transferenciaResultado != null) {

			System.out.println(transferenciaResultado);

		} else {

			System.out.println("No se puedo encontrar el transferencia" + idTransferencia);

		}
	}

	private Transferencia buscarTransferenciaPorId(int idTransferencia) {
		Transferencia transferenciaResultado = null;

		for (int i = 0; i < transferencias.size(); i++) {

			Transferencia transferencia = transferencias.get(i);

			if (transferencia.getId() == idTransferencia) {

				transferenciaResultado = transferencia;

				return transferenciaResultado;

			}

		}

		return null;
	}

	private void verTodosLosTransferencia() {

		if (transferencias.isEmpty()) {

			System.out.println("Todavia no hay transferencias.");

		}

		transferencias.forEach(transferencia -> {

			System.out.println(transferencia);

		});

	}
	

	private void insertarTransferencia() {

		System.out.println("concepto: ");

		String concepto = teclado.nextLine();

		System.out.println("importe: ");

		Double importe = teclado.nextDouble();
		System.out.print("idOrigin");
		Integer idOrdenante = teclado.nextInt();

		System.out.println("idBeneficiario: ");
		Integer idBeneficiario = teclado.nextInt();

		Transferencia nuevoTransferencia = new Transferencia(siguienteIdTransferencia, idOrdenante, idBeneficiario,importe , concepto );

		transferencias.add(nuevoTransferencia);


		siguienteIdTransferencia++;

		System.out.println("¡transferencia creado con exito!");

	}

	private void cerrar() {
		teclado.close();

		System.out.println("¡Hasta pronto!");
	}

	private void iniciar() {




		

		Scanner teclado = new Scanner(System.in);

		int opcion = -1;

		do {

			mostrarMenu();

			System.out.println("Selecciona una opcion: ");

			opcion = teclado.nextInt();

			switch (opcion) {

			case 1:

				insertarGestor();

				break;

			case 2:

				insertarGestoresDePrueba();

				break;

			case 3:

				consultarGestor();

				break;

			case 4:

				verTodosLosGestores();

				break;

			case 5:

				actualizarGestor();

				break;

			case 6:

				eliminarGestor();

				break;

			case 7:
				insertarCliente();

				break;

			case 8:
				consultarCliente();

				break;

			case 9:
				verTodosLosCliente();
				break;

			case 10:
				actualizarCliente();
				break;
			case 11:
              eliminarCliente();
              break;
			case 12:
				consultarMensaje();
				break;

			case 13:
				verTodosLosMensaje();
				break;
			case 14:
				insertarMensaje();
				break;

			case 15:
				consultarTransferencia();
				break;
				
			case 16:
				verTodosLosTransferencia();
				break;
				
			case 17:
				insertarTransferencia();
				break;
				
				
			case 18:
				login();
				break;

			case 0:
				cerrar();
				break;

			default:
				

				System.out.println("Opcion desconocida...");

			}

		} while (opcion != 0);

	}

	public static void main(String[] args) {

		ConsoleBank consola = new ConsoleBank();

		consola.iniciar();

	}
	

}
