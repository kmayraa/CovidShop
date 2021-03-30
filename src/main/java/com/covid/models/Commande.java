package com.covid.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "commandes")
public class Commande implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long numCmd;
	// collection medicament Patient Phamrcie livreur
	private double montant;

	/*
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "codePhar") private Pharmacien pharmacie;
	 * 
	 * @OneToOne
	 * 
	 * @JoinColumn(name = "cin") private Patient patient;
	 * 
	 * @OneToMany(mappedBy = "numCmd") private Collection<Medicament> medicaments;
	 */
	public Commande() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commande(Long numCmd, double montant) {
		super();
		this.numCmd = numCmd;
		this.montant = montant;
	}

	public Long getNumCmd() {
		return numCmd;
	}

	public void setNumCmd(Long numCmd) {
		this.numCmd = numCmd;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	/*
	 * public Pharmacien getPharmacie() { return pharmacie; }
	 * 
	 * public void setPharmacie(Pharmacien pharmacie) { this.pharmacie = pharmacie;
	 * }
	 * 
	 * public Patient getPatient() { return patient; }
	 * 
	 * public void setPatient(Patient patient) { this.patient = patient; }
	 * 
	 * public Collection<Medicament> getMedicaments() { return medicaments; }
	 * 
	 * public void setMedicaments(Collection<Medicament> medicaments) {
	 * this.medicaments = medicaments; }
	 * 
	 * public static long getSerialversionuid() { return serialVersionUID; }
	 */
}
