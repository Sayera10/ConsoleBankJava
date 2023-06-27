package app_banco.modelos;

public class Gestor extends Usuarios {
	private String oficina;

	public Gestor() {
		// TODO Auto-generated constructor stub
	}

	public Gestor(Integer id, String usuario, String password, String correo) {
		super(id, usuario, password, correo);
		// TODO Auto-generated constructor stub
	}

	public Gestor(Integer id, String usuario, String password, String correo, String Oficina) {
		super(id, usuario, password, correo);
		this.oficina = oficina;
		// TODO Auto-generated constructor stub
	}

	public String getOficina() {
		return oficina;
	}

	public void setOficina(String oficina) {
		this.oficina = oficina;
	}

public String toString() {
		
		return "Gestor{id: " +this.id +  ", usuario: " + this.usuario + " , oficina:" +this.oficina +  " }";
		
		
	}




}

