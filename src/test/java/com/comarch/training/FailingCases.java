package com.comarch.training;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FailingCases {
	
	
	SimpleCalculator simpleCalculator;
	@BeforeClass
	public void init(){
		simpleCalculator = new SimpleCalculator();
	}
	

	@DataProvider(name = "test1")
	public Object[][] createData1() {
	 return new Object[][] {
	   {1,2,2},
	   {1,3,3},
	   {1,3,3},
	 };
	}
	

	@Test(groups = { "CalcTestMulti" }, dataProvider="test1")
	public void MultiplyingTestCopy(int x, int y,int zz) {
		
		//Given
		
		//When
		int z = simpleCalculator.multiply(x, y);
		System.out.println("z= "+x+"y= "+y+"zz="+zz);
		//Than
		Assert.assertEquals(z, zz);	
	}
	
	
	
	/*@Test(groups = { "CalcTestMulti" }, dependsOnMethods = { "minusingTest" })
	public void MultiplyingTest() {
		
		//Given
		int x = 5;
		int y = 10;
		
		//When
		int z = simpleCalculator.multiply(x, y);
		
		//Than
		Assert.assertEquals(z, 50);	
	}
	
	@Test(groups = { "CalcTestDiv" }, dependsOnMethods = { "minusingTest" })
	public void DividingTest() {
		
		//Given
		int x = 20;
		int y = 10;
		
		//When
		int z = simpleCalculator.divide(x, y);
		
		//Than
		Assert.assertEquals(z, 2);	
	}
	

	@Test(groups = { "CalcTestMinus" })
	public void minusingTest() {
		
		//Given
		int x = 10;
		int y = 10;
		
		//When
		int z = simpleCalculator.minus(x, y);
		
		//Than
		Assert.assertEquals(z, 2);	
	}
	*/
}
