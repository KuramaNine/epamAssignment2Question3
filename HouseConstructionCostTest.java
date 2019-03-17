package epamTask3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class HouseConstructionCostTest {
	HouseConstructionCost houseConstructionCostObject;
	@Before
	public void setUp() throws Exception {
		houseConstructionCostObject=new HouseConstructionCost("high standard", 100, true);
	}

	@Test
	public void test() {
		Assert.assertEquals(250000, houseConstructionCostObject.calculatePrice());
	}

}
