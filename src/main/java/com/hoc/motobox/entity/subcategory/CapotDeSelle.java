package com.hoc.motobox.entity.subcategory;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

import com.hoc.motobox.entity.category.Selle;

@Entity
public class CapotDeSelle extends Selle {

	public CapotDeSelle(Ad json) {
		super(json);
		// TODO Auto-generated constructor stub
	}

}
