package taskone;

import static org.junit.Assert.*;

import org.junit.Test;

import taskone.SimpleInterest;

public class SimpleinterestTesting {


	@Test
	public void test() {
		SimpleInterest simpleintersetobj=new SimpleInterest();
		assertEquals(100.00,simpleintersetobj.simpleInterestCalculation(100.00,10.00,10.00),0.1);
	}

}
