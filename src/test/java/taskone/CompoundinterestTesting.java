package taskone;

import static org.junit.Assert.*;

import org.junit.Test;

import taskone.CompoundInterest;

public class CompoundinterestTesting {

	@Test
	public void test() {
		CompoundInterest compoundinterestobj=new CompoundInterest();
		assertEquals(3144.47,compoundinterestobj.compoundInterestCalculation(5000.00,5.00,10.00,"annually"),0.01);
		assertEquals(1381.40,compoundinterestobj.compoundInterestCalculation(5000.00,5.00,10.00,"halfyearly"),0.01);
		assertEquals(512.50,compoundinterestobj.compoundInterestCalculation(5000.00,5.00,8.00,"quarterly"),0.1);
		assertEquals(0.0,compoundinterestobj.compoundInterestCalculation(5000.00,5.00,8.00,"any"),0.1);
		
	}

}
