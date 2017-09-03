package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* Entity bean with JPA annotations Hibernate provides JPA imple
mentation
*/
@Entity
@Table(name = "TB_Usuario")
public class Usuario {

	@Id
	@Column(name = "CodUsu")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codUsu;

	@Column(name = "NomeUsu")
	private String nomeusuario;

	@Column(name = "EmailUsu")
	private String emailusuario;
	
	@Column(name = "SenhaUsu")
	private String senhausuario;

	public int getCodUsu() {
		return codUsu;
	}

	public void setCodUsu(int codUsu) {
		this.codUsu = codUsu;
	}

	public String getNomeusuario() {
		return nomeusuario;
	}

	public void setNomeusuario(String nomeusuario) {
		this.nomeusuario = nomeusuario;
	}

	public String getEmailusuario() {
		return emailusuario;
	}

	public void setEmailusuario(String emailusuario) {
		this.emailusuario = emailusuario;
	}

	public String getSenhausuario() {
		return senhausuario;
	}

	public void setSenhausuario(String senhausuario) {
		this.senhausuario = senhausuario;
	}
	
	@Override
	public String toString() {
	return "TB_Usuario [codUsu=" + codUsu + ", EmailUsu=" + emailusuario + ", NomeUsu=" + nomeusuario + 
			", SenhaUsu=" + senhausuario + "]";
	}
	
	@Override
	public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + codUsu;
	return result;
	}
	
	@Override
	public boolean equals(Object obj) {
	if (this == obj)
	return true;
	if (obj == null)
	return false;
	if (getClass() != obj.getClass())
	return false;
	Usuario other = (Usuario) obj;
	if (codUsu != other.codUsu)
	return false;
	return true;
	}

	
	
}
