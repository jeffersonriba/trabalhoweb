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
@Table(name = "TB_RespostasCad")
public class RespostasCad {
	
	

	
	@Id
	@Column(name = "CodRespCad")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codRespCad;
	
	@Column(name = "QtdResp")
	private int qtdResp;
	
	@Column(name = "DescRespCad")
	private int descRespCad;
	
	@Column(name = "CodQuest")
	private int codQuest;

	@Column(name = "CodPerg")
	private int codPerg;

	public int getCodRespCad() {
		return codRespCad;
	}

	public void setCodRespCad(int codRespCad) {
		this.codRespCad = codRespCad;
	}

	public int getQtdResp() {
		return qtdResp;
	}

	public void setQtdResp(int qtdResp) {
		this.qtdResp = qtdResp;
	}

	public int getDescRespCad() {
		return descRespCad;
	}

	public void setDescRespCad(int descRespCad) {
		this.descRespCad = descRespCad;
	}

	public int getCodQuest() {
		return codQuest;
	}

	public void setCodQuest(int codQuest) {
		this.codQuest = codQuest;
	}

	public int getCodPerg() {
		return codPerg;
	}

	public void setCodPerg(int codPerg) {
		this.codPerg = codPerg;
	}
	
	
}
