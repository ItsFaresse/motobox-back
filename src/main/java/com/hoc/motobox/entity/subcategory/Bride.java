package com.hoc.motobox.entity.subcategory;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

import com.hoc.motobox.entity.category.CarburationInjection;

@Entity
public class Bride extends CarburationInjection {

	public Bride(Ad json) {
		super(json);
		// TODO Auto-generated constructor stub
	}

}
