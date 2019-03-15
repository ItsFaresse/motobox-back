package com.hoc.motobox.entity.subcategory;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

import com.hoc.motobox.entity.category.Jantes;

@Entity
public class AxeDeRoueAvant extends Jantes {

	public AxeDeRoueAvant(Ad json) {
		super(json);
		// TODO Auto-generated constructor stub
	}

}
