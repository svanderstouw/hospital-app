package hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class JanitorTest {

	Janitor underTest = new Janitor("5", "name", true);
	
	@Test
	public void shouldReturnEmpNumber() {
		String checkNumber = underTest.getEmpNumber();
		assertEquals(checkNumber, "5");
	}
	
	@Test
	public void shouldReturnEmpName() {
		String checkName = underTest.getEmpName();
		assertEquals(checkName, "name");
	}
	
	@Test
	public void shouldGetPaid40k() {
		String check = underTest.calculatePay();
		assertEquals(check, "40,000");
	}
	
	@Test
	public void isSweeping() {
		boolean checkPhone = underTest.isSweeping();
		assertTrue(checkPhone);
	}
}
