package datastructure.com;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculationTest {
	@Test
	public void testFindMax() {
		assertEquals(4,Calulation.findMax(new int[] {1,2,3,4})); 
	}
}
