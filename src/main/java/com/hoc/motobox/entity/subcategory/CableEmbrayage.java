package com.hoc.motobox.entity.subcategory;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

import com.hoc.motobox.entity.category.Cables;


@Entity
public class CableEmbrayage extends Cables {

	public CableEmbrayage(Ad json) {
		super(json);
		// TODO Auto-generated constructor stub
	}

}
