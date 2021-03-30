package com.covid.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "maladies")
public class Maladie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codeMal;
	private String nomMal;

	public Maladie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getCodeMal() {
		return codeMal;
	}

	public void setCodeMal(Long codeMal) {
		this.codeMal = codeMal;
	}

	public String getNomMal() {
		return nomMal;
	}

	public void setNomMal(String nomMal) {
		this.nomMal = nomMal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Maladie(Long codeMal, String nomMal) {
		super();
		this.codeMal = codeMal;
		this.nomMal = nomMal;
	}

}
