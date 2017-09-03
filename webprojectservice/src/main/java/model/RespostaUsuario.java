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
@Table(name = "TB_RESPUSU")
public class RespostaUsuario {

	@Id
	@Column(name = "CodRespUsu")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codRespUsu;
	
	@Column(name = "codQuest")
	private int codQuest;
	
	@Column(name = "descRespUsu")
	private String descRespUsu;
	
	@Column(name = "CodRespCad")
	private int codRespCad;

	@Column(name = "CodUsu")
	private int codUsu;
	
	@Column(name = "CodPerg")
	private int codPerg;

	public int getCodRespUsu() {
		return codRespUsu;
	}

	public void setCodRespUsu(int codRespUsu) {
		this.codRespUsu = codRespUsu;
	}

	public int getCodQuest() {
		return codQuest;
	}

	public void setCodQuest(int codQuest) {
		this.codQuest = codQuest;
	}

	public String getDescRespUsu() {
		return descRespUsu;
	}

	public void setDescRespUsu(String descRespUsu) {
		this.descRespUsu = descRespUsu;
	}

	public int getCodRespCad() {
		return codRespCad;
	}

	public void setCodRespCad(int codRespCad) {
		this.codRespCad = codRespCad;
	}

	public int getCodUsu() {
		return codUsu;
	}

	public void setCodUsu(int codUsu) {
		this.codUsu = codUsu;
	}

	public int getCodPerg() {
		return codPerg;
	}

	public void setCodPerg(int codPerg) {
		this.codPerg = codPerg;
	}
	
	
	
	
	
	
	
}
