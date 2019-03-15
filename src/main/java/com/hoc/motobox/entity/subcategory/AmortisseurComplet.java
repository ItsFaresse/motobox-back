package com.hoc.motobox.entity.subcategory;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

import com.hoc.motobox.entity.category.AmortisseurArriere;

@Entity
public class AmortisseurComplet extends AmortisseurArriere {

	public AmortisseurComplet(Ad json) {
		super(json);
		// TODO Auto-generated constructor stub
	}

}
