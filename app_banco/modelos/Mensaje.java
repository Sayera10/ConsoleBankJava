package app_banco.modelos;

import java.util.Date;

public class Mensaje {
	private Integer id;
	private Integer idOrigin;
	private Integer idDestino;
	private String texto;
	private Date fecha;
	
	public Mensaje() {

	}
	

	public Mensaje(Integer id, Integer idOrigin, Integer idDestino, String texto) {
		this.id = id;
		this.idOrigin = idOrigin;
		this.idDestino= idDestino;
		this.texto=texto;
		this.fecha=new Date();
}
	
	

	

	public Integer getId() {
		return id;
	}


	
	public void setId(Integer id) {
		this.id = id;
	}


	public Integer getIdOrigin() {
		return idOrigin;
	}


	public void setIdOrigin(Integer idOrigin) {
		this.idOrigin = idOrigin;
	}


	public Integer getIdDestino() {
		return idDestino;
	}


	public void setIdDestino(Integer idDestino) {
		this.idDestino = idDestino;
	}


	public String getTexto() {
		return texto;
	}


	public void setTexto(String texto) {
		this.texto = texto;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
public String toString() {
		
		return "Mensaje{id: " +this.id +  ", idOrigin: " +this.idOrigin + " , idDestino: " + this.idDestino + " , texto: " +this.texto +" , fecha: " +this.fecha +  " }";
		
		
	}
	
	
	public boolean equals(Object o) {
		Mensaje g = (Mensaje) o;
		boolean mismoId = this.id == g.id;
		return mismoId;

}
	
	

}
