package app_banco.modelos;

import java.util.Date;

public class Transferencia {
        private Integer id;
		private Integer idOrdenante;
		private Integer idBeneficiario;
		private Double importe;
		private String concepto;
		private Date fecha;
		
		
	public Transferencia() {
		
	}
	
	public Transferencia(Integer id, Integer idOrdenante, Integer idBeneficiario, Double importe,String concepto) {
		this.id = id;
		this.idOrdenante = idOrdenante;
		this.idBeneficiario= idBeneficiario;
		this.concepto =concepto;
		this.fecha=new Date();
		
}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getIdOrdenante() {
		return idOrdenante;
	}

	public void setIdOrdenante(Integer idOrdenante) {
		this.idOrdenante = idOrdenante;
	}

	public Integer getIdBeneficiario() {
		return idBeneficiario;
	}

	public void setIdBeneficiario(Integer idBeneficiario) {
		this.idBeneficiario = idBeneficiario;
	}

	public Double getImporte() {
		return importe;
	}

	public void setImporte(Double importe) {
		this.importe = importe;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
		
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	
	
public String toString() {
		
		return "Mensaje{id: " +this.id +  ", idOrdenante: " +this.idOrdenante + " , idBeneficiario: " + this.idBeneficiario + " , concepto: " +this.concepto +" , fecha: " +this.fecha +  " }";
		
		
	}
	
	
	public boolean equals(Object o) {
		Mensaje g = (Mensaje) o;
		boolean mismoId = this.id == g.getId();
		return mismoId;

}
	
	


}
