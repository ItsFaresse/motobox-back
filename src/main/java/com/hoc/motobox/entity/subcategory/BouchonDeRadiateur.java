package com.hoc.motobox.entity.subcategory;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

import com.hoc.motobox.entity.category.Radiateur;

@Entity
public class BouchonDeRadiateur extends Radiateur {

	public BouchonDeRadiateur(Ad json) {
		super(json);
		// TODO Auto-generated constructor stub
	}

}
