	package com.example.demo.entities;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Produit")
public class Produit implements Serializable {
	@Id
	@GeneratedValue
	private long id;
	private String designation;
	private double prix;
	
	public Produit(String designation) {
		super();
		this.designation = designation;
	}
	
	
	public Produit() {}
	
	
	
	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public double getPrix() {
		return prix;
	}


	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	
}