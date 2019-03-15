package com.hoc.motobox.entity.subcategory;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

import com.hoc.motobox.entity.category.FaisceauxElectriques;

@Entity
public class CapteursDivers extends FaisceauxElectriques {

	public CapteursDivers(Ad json) {
		super(json);
		// TODO Auto-generated constructor stub
	}

}
