package com.hoc.motobox.entity.subcategory;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
public class Cadre extends com.hoc.motobox.entity.category.Cadre {

	public Cadre(Ad json) {
		super(json);
		// TODO Auto-generated constructor stub
	}

}
