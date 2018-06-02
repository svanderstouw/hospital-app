package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SurgeonTest {
	
	Surgeon underTest = new Surgeon("3", "name", "area", true);
	Patient patient = new Patient();
	
	@Test
	public void shouldBeAbleToDrawBlood() {			
		int bloodLevelBefore = patient.getBloodLevel();
		underTest.drawBlood(patient);
		int bloodLevelAfter = patient.getBloodLevel();
		assertThat(bloodLevelBefore-bloodLevelAfter, is(5));
	}
	
	@Test
	public void shouldBeAbletoIncreasePatientHealthWithCare() {
		int healthLevelBefore = patient.getHealthLevel();
		underTest.administerCare(patient);
		int healthLevelAfter = patient.getHealthLevel();
		assertThat(healthLevelAfter - healthLevelBefore, is(5));
	}

	@Test
	public void shouldReturnEmpNumber() {
		String checkNumber = underTest.getEmpNumber();
		assertEquals(checkNumber, "3");
	}
	
	@Test
	public void shouldReturnEmpName() {
		String checkName = underTest.getEmpName();
		assertEquals(checkName, "name");
	}
	
	@Test
	public void shouldReturnSpecialty() {
		String checkSpecialty = underTest.getSpecialty();
		assertEquals(checkSpecialty, "area");
	}
	
	@Test
	public void shouldGetPaid120k() {
		String check = underTest.calculatePay();
		assertEquals(check, "120,000");
	}
	
	@Test
	public void isSurgeonOperating() {
		boolean checkSurgery = underTest.isOperating();
		assertTrue(checkSurgery);
	}
}
