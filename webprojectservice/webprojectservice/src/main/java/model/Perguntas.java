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
@Table(name = "TB_Perguntas")
public class Perguntas {

	
	
	@Id
	@Column(name = "CodPerg")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codPerg;
	
	@Column(name = "DescPerg")
	private String descPerg;
	
	@Column(name = "respCad")
	private Boolean respCad;
	
	@Column(name = "CodUsu")
	private Integer codUsu;
	
	@Column(name = "CodQuest")
	private Integer codQuest;

	public int getCodPerg() {
		return codPerg;
	}

	public void setCodPerg(int codPerg) {
		this.codPerg = codPerg;
	}

	public String getDescPerg() {
		return descPerg;
	}

	public void setDescPerg(String descPerg) {
		this.descPerg = descPerg;
	}

	public Boolean getRespCad() {
		return respCad;
	}

	public void setRespCad(Boolean respCad) {
		this.respCad = respCad;
	}

	public Integer getCodUsu() {
		return codUsu;
	}

	public void setCodUsu(Integer codUsu) {
		this.codUsu = codUsu;
	}

	public Integer getCodQuest() {
		return codQuest;
	}

	public void setCodQuest(Integer codQuest) {
		this.codQuest = codQuest;
	}

	
	
	
}
