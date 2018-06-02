package hospital;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Test;

public class ReceptionistTest {

	Receptionist underTest = new Receptionist("4", "name", false);
	
	@Test
	public void shouldReturnEmpNumber() {
		String checkNumber = underTest.getEmpNumber();
		assertEquals(checkNumber, "4");
	}
	
	@Test
	public void shouldReturnEmpName() {
		String checkName = underTest.getEmpName();
		assertEquals(checkName, "name");
	}
	
	@Test
	public void shouldGetPaid45k() {
		String check = underTest.calculatePay();
		assertEquals(check, "45,000");
	}
	
	@Test
	public void isOnPhone() {
		boolean checkPhone = underTest.isOnPhone();
		assertFalse(checkPhone);
	}
}
