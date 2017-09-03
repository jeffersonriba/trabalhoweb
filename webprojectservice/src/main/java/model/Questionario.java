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
@Table(name = "TB_Questionario")
public class Questionario {
	
	
	@Id
	@Column(name = "CodQuest")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codQuest;

	@Column(name = "NomeQuest")
	private String nomeQuest;
	
	@Column(name = "DescQuest")
	private String descQuest;
	
	@Column(name = "CodUsu")
	private int codUsu;
	
	@Column(name = "NomeUsu")
	private String nomeUsu;

	public int getCodQuest() {
		return codQuest;
	}

	public void setCodQuest(int codQuest) {
		this.codQuest = codQuest;
	}

	public String getNomeQuest() {
		return nomeQuest;
	}

	public void setNomeQuest(String nomeQuest) {
		this.nomeQuest = nomeQuest;
	}

	public String getDescQuest() {
		return descQuest;
	}

	public void setDescQuest(String descQuest) {
		this.descQuest = descQuest;
	}

	public int getCodUsu() {
		return codUsu;
	}

	public void setCodUsu(int codUsu) {
		this.codUsu = codUsu;
	}

	public String getNomeUsu() {
		return nomeUsu;
	}

	public void setNomeUsu(String nomeUsu) {
		this.nomeUsu = nomeUsu;
	}
	
	
}
