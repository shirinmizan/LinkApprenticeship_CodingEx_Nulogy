package com.nulogy.test;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Test;
import com.nulogy.controller.CalculatePrice;
import com.nulogy.model.Markups;
import junit.framework.TestCase;

/**
 * @author Shirin Mizan
 * 
 */
public class MarkupCalc_test extends TestCase {

	private CalculatePrice calculator;
	
	@BeforeClass
	public void setUp() throws Exception {
		calculator = new CalculatePrice();
	}

	/**
     * Input 1:
     * --------
     * $1299.99
     * 3 people
     * food
     * Output 1: $1591.58
     */
    @Test
    public void testForThreePersonsAndFood() {
    	
    	final double basePrice = 1299.99d;
    	double amount = calculator.calculate(basePrice, 3, Markups.FOOD);
        assertEquals(1591.58d, amount, 0.01);
    }
    
    /**
     * Input 2:
     * --------
     * $5432.00
     * 1 person
     * drugs
     * Output 2: $6199.81
     */
    @Test
    public void testForOnePersonAndDrugs() {
        
    	final double baseAmount = 5432.00d;
        final double amount = calculator.calculate(baseAmount, 1, Markups.PHARMACEUTICALS);
        assertEquals(6199.81d, amount, 0.01);
    }

    /**
     * Input 3:
     * --------
     * $12456.95
     * 4 people
     * books
     * Output 3: $13707.63
     */
    @Test
    public void testWithFourPeopleAndBooks() {
        
    	final double baseAmount = 12456.95d;
        final double amount = calculator.calculate(baseAmount, 4, Markups.EVERYTHINGELSE);
        assertEquals(13707.63d, amount, .01d);
    }

}
