package app_banco.modelos;

public class Cliente extends Usuarios {
	private String oficina;
	public Cliente() {
		
		super();
	}

	public Cliente(Integer id, String usuario, String password, String correo, double saldo) {
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
		
		return "Cliente{id: " +this.id +  ", usuario: " + this.usuario + " , oficina:" +this.oficina +  " }";
		
		
	}





}

