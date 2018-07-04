package org.spr.model;

public class PoeticJugglar extends Juggler {

	//private int beanBags;
	private Poem poem;
	 
	public PoeticJugglar(Poem poem) {
		super();
		this.poem = poem;
	}
	
	public PoeticJugglar(int beanBags,Poem poem) {
		super(beanBags);
		this.poem = poem;
	}
	
	@Override
	public void perform() {
		
		super.perform();
		System.out.println("While Reciting...");
		poem.recite();
	}
	
	
	
}
