package org.spr.dip;

public class KnightOfTheRoundtable implements Knight {

	private String name;
	private HolyGrailQuest quest;
	private Quest quest2;

	/*
	 * public KnightOfTheRoundtable(String name) { this.name = name; //tightly
	 * coupled. only HolyGrailQuest can be used. quest = new HolyGrailQuest(); }
	 */

	/*
	 * public HolyGrail embarkOnQuest(){ return quest.embark(); }
	 */

	public KnightOfTheRoundtable(String name) {
		this.name = name;
	}

	@Override
	public Object embarkQuest() throws NullPointerException {
		return quest2.embark();
	}

	public Quest getQuest2() {
		return quest2;
	}

	// now it is loosely coupled we can inject any quest object from out side
	public void setQuest2(Quest quest2) {
		this.quest2 = quest2;
	}

}
