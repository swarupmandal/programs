package org.spr.model;

public abstract class Footballer implements Performer {

	public abstract Instrument getInstrument();
	private String country;
	
	@Override
	public void perform() {
		System.out.println("Footballer");
		getInstrument().play();
		
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
