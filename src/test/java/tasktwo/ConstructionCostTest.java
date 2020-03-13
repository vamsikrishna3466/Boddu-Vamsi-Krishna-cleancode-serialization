package tasktwo;

import static org.junit.Assert.*;
import org.junit.Test;

import tasktwo.ConstructionCost;



public class ConstructionCostTest {

	
	
	@Test
	public void test() {
		ConstructionCost constructionCostObject=new ConstructionCost();
		
		double a=constructionCostObject.costCalculation(12.00,"standard");
		assertEquals(14400.00,a,0.1);
		assertEquals(18000.00,constructionCostObject.costCalculation(12.00,"above standard"),0.1);
		assertEquals(21600.00,constructionCostObject.costCalculation(12.00,"high standard"),0.1);
		assertEquals(30000.00,constructionCostObject.costCalculation(12.00,"AutomatedHome"),0.1);
		assertEquals(0.0,constructionCostObject.costCalculation(12.00,"Any name"),0.1);

	}

}
