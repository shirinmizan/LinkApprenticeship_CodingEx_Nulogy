package com.nulogy.controller;

import com.nulogy.model.Markups;

/**
 * @author Shirin Mizan
 * 
 */

public class CalculatePrice {
	
	public double calculate(double basePrice, int numPerson, Markups materialType) {
		double finalPrice;

		/**if (basePrice < 0 || workers < 0) {
			System.out.println("Base Price and workers number cannot be ")
		}**/

		finalPrice = basePrice * flatMarkup() * otherMarkups(numPerson, materialType);

		return finalPrice;
	}
	
	/**
	 * Calculate the flat markup
	 * @return The multiply factor with flatMarkup
	 */
	private double flatMarkup() {
		return 1 + Markups.FLAT.markup();
	}
	
	/**
	 * 
	 * @param numPerson
	 * @param materialType
	 * @return The Multiply factor with number of workers markup and the materials type markup
	 */
	private double otherMarkups(int numPerson, Markups materialType){
		return 1 + numPerson * Markups.PERSON.markup() + materialType.markup();
	}

}
