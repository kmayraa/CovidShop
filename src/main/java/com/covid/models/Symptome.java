package com.covid.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "symptomes")
public class Symptome implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String nameSym;

	public Symptome() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Symptome(Long id, String nameSym) {
		super();
		this.id = id;
		this.nameSym = nameSym;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameSym() {
		return nameSym;
	}

	public void setNameSym(String nameSym) {
		this.nameSym = nameSym;
	}

}
