package org.spr.model;

import java.util.Collection;

public class OneManBrand implements Performer {

	private String name;
	private Collection<Instrument> instruments;
	
	public OneManBrand() {
		
	}
	
	@Override
	public void perform() {
		
		System.out.println(name + " Is playing");
		
		for(Instrument instrument : instruments){
			instrument.play();
		}
		
	}

	public Collection<Instrument> getInstruments() {
		return instruments;
	}

	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}
