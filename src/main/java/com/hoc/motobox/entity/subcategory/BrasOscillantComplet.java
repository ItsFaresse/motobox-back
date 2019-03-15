package com.hoc.motobox.entity.subcategory;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

import com.hoc.motobox.entity.category.BrasOscillant;

@Entity
public class BrasOscillantComplet extends BrasOscillant {

	public BrasOscillantComplet(Ad json) {
		super(json);
		// TODO Auto-generated constructor stub
	}

}
