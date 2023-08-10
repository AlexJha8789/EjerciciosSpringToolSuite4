package pe.edu.cibertec.proyemp.jpa.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="tb_departamento")
public class Departamento {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_Departamento")
	private int idDepartamento;
	
	
	@Column(name="nom_Departamento")
	private String nombreDepartamento;


	public int getIdDepartamento() {
		return idDepartamento;
	}


	public void setIdDepartamento(int idDepartamento) {
		this.idDepartamento = idDepartamento;
	}


	public String getNombreDepartamento() {
		return nombreDepartamento;
	}


	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

}
