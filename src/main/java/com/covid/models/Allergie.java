package com.covid.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "allergies")
public class Allergie implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long codeAll;
	private String nomAll;

	public Allergie() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Allergie(Long codeAll, String nomAll) {
		super();
		this.codeAll = codeAll;
		this.nomAll = nomAll;
	}

	public Long getCodeAll() {
		return codeAll;
	}

	public void setCodeAll(Long codeAll) {
		this.codeAll = codeAll;
	}

	public String getNomAll() {
		return nomAll;
	}

	public void setNomAll(String nomAll) {
		this.nomAll = nomAll;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
