package com.hoc.motobox.controller;

public class Category {

	public String libelle;
	public String className;
	
	
	public void setClassName(String className) {
		this.className = className;
	}

	public Category(String libelle,
	String className) {
		this.libelle = libelle;
		this.className = className;
	}
	
	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public String getClassName() {
		return className;
	}


	
}
