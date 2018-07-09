package org.spr.model;

public class Magician implements Performer {

	private String chant;
	private MagicBox magicBox;
	
	@Override
	public void perform() {
	
		System.out.println("Magician Starts magic");
		System.out.println(chant);
		System.out.println(magicBox.getContents());
		
	}

	public String getChant() {
		return chant;
	}

	public void setChant(String chant) {
		this.chant = chant;
	}

	public MagicBox getMagicBox() {
		return magicBox;
	}

	public void setMagicBox(MagicBox magicBox) {
		this.magicBox = magicBox;
	}

}
