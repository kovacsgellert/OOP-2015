package com.gellert.zoowsome.models.animals;

import com.gellert.zoowsome.services.factories.Constants;

public class Lizard extends Reptile {
	public Lizard(String name, int nrOfLegs, boolean laysEggs, double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
		this.setName(name);
		this.setNrOfLegs(nrOfLegs);
		this.setLaysEggs(laysEggs);
	}
	
	public Lizard() {
		this.setName("Lizzy");
		this.setNrOfLegs(4);
		this.setLaysEggs(true);
	}
}
