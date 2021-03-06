package com.gellert.zoowsome.models.animals;
import org.w3c.dom.Element;

public abstract class Reptile extends Animal {	

	private boolean laysEggs;
	
	public Reptile() {
		
	}
	
	public Reptile(double maintenanceCost, double dangerPerc) {
		super(maintenanceCost, dangerPerc);
	}

	public void decodeFromXml(Element element) {
		super.decodeFromXml(element);
		setLaysEggs(Boolean.valueOf(element.getElementsByTagName("laysEggs").item(0).getTextContent()));
	}

	public boolean getLaysEggs() {
		return laysEggs;
	}

	public void setLaysEggs(boolean laysEggs) {
		this.laysEggs = laysEggs;
	}
}
