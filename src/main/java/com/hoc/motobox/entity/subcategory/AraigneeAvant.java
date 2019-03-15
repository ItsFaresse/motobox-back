package com.hoc.motobox.entity.subcategory;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

import com.hoc.motobox.entity.category.Cadre;

@Entity
@DiscriminatorColumn(
	    name="Araignee Avant",
	    discriminatorType=DiscriminatorType.STRING
	    )
public class AraigneeAvant extends Cadre {

	public AraigneeAvant(Ad json) {
		super(json);
		// TODO Auto-generated constructor stub
	}

}
