package com.hoc.motobox.entity.subcategory;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

@Entity
public class BoiteAAir extends com.hoc.motobox.entity.category.BoiteAAir {

	public BoiteAAir(Ad json) {
		super(json);
		// TODO Auto-generated constructor stub
	}

}
