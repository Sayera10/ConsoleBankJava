package app_banco.modelos;

public class Cliente extends Usuarios {
	private double saldo;
	private Integer idGestor;

	public Cliente() {

		super();
	}

	public Cliente(Integer id, String usuario, String password, String correo, double saldo, Integer idGestor) {
		super(id, usuario, password, correo);
		this.saldo = saldo;
		this.idGestor = idGestor;
		// TODO Auto-generated constructor stub
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Integer getIdGestor() {
		return idGestor;
	}

	public void setIdGestor(Integer idGestor) {
		this.idGestor = idGestor;
	}

	public String toString() {

		return "Cliente{id: " + this.id + ", usuario: " + this.usuario + " , saldo:" + this.saldo + " }";

	}

}
