package com.nulogy.model;

/**
 * @author Shirin Mizan
 * 
 */

public enum Markups {
	
	FLAT(1, 0.05),    			//flat id 1, markup 5%
	PERSON(2, 0.012), 			//person that needs to work markup 1.2%
	PHARMACEUTICALS(3, 0.075),  //pharmaceuticals markup 7.5%
	FOOD(4, 0.13),				//food markup 13%
	ELECTRONICS(5, 0.02),		//electronics markup 2%
	EVERYTHINGELSE(6, 0);		//everything else no markup
	
	private final int id;
	private final double markup;
	
	
	Markups(int id, double markup) {
		this.id = id;
		this.markup = markup;
	}

	public double markup() {
		return markup;
	}

}
