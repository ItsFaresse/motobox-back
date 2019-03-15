package com.hoc.motobox.entity.subcategory;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;

import com.hoc.motobox.entity.category.Cadre;

@Entity
@DiscriminatorColumn(
	    name="Boucle Arriere",
	    discriminatorType=DiscriminatorType.STRING
	    )
public class BoucleArriere extends Cadre {


}
