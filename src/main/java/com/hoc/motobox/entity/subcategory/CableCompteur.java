package com.hoc.motobox.entity.subcategory;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

import com.hoc.motobox.entity.category.Compteur;

@Entity
public class CableCompteur extends Compteur {

	public CableCompteur(Ad json) {
		super(json);
		// TODO Auto-generated constructor stub
	}

}
