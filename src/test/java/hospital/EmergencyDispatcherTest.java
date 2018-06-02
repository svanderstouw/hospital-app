package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class EmergencyDispatcherTest {

	EmergencyDispatcher underTest = new EmergencyDispatcher("6", "name", false, true);
	Patient patient = new Patient();

	@Test
	public void shouldReturnEmpNumber() {
		String checkNumber = underTest.getEmpNumber();
		assertEquals(checkNumber, "6");
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

	@Test
	public void isOnEmergencyCall() {
		boolean checkOnCall = underTest.isOnEmergencyCall();
		assertTrue(checkOnCall);

	}

	@Test
	public void shouldBeAbleToDrawBlood() {
		int bloodLevelBefore = patient.getBloodLevel();
		underTest.drawBlood(patient);
		int bloodLevelAfter = patient.getBloodLevel();
		assertThat(bloodLevelBefore - bloodLevelAfter, is(5));
	}

	@Test
	public void shouldBeAbletoIncreasePatientHealthWithCare() {
		int healthLevelBefore = patient.getHealthLevel();
		underTest.administerCare(patient);
		int healthLevelAfter = patient.getHealthLevel();
		assertThat(healthLevelAfter - healthLevelBefore, is(5));
	}
}
