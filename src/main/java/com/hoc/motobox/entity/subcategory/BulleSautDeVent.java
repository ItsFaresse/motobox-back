package com.hoc.motobox.entity.subcategory;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

import com.hoc.motobox.entity.category.CarenageDivers;

@Entity
public class BulleSautDeVent extends CarenageDivers {

	public BulleSautDeVent(Ad json) {
		super(json);
		// TODO Auto-generated constructor stub
	}

}
