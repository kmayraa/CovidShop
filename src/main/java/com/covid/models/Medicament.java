package com.covid.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "medicaments")
public class Medicament implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codeMedic;
	private String nomMedic;
	private double prix;

	public Medicament() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicament(Long codeMedic, String nomMedic, double prix) {
		super();
		this.codeMedic = codeMedic;
		this.nomMedic = nomMedic;
		this.prix = prix;
	}

	public Long getCodeMedic() {
		return codeMedic;
	}

	public void setCodeMedic(Long codeMedic) {
		this.codeMedic = codeMedic;
	}

	public String getNomMedic() {
		return nomMedic;
	}

	public void setNomMedic(String nomMedic) {
		this.nomMedic = nomMedic;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
