package com.comarch.training;


import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class PositiveCases {
	SimpleCalculator simpleCalculator;

	@BeforeClass
	public void init(){
		simpleCalculator = new SimpleCalculator();
	}
	
	@Test()
	public void AddingTest() {
		
		//Given
		int x = 5;
		int y = 10;
		
		//When
		int z = simpleCalculator.add(x, y);
		
		//Than
		Assert.assertEquals(z, 15);
				
	}
}
