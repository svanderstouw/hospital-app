package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class NurseTest {

	Nurse underTest = new Nurse("2", "name", 1);
	Patient patient = new Patient();

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
		assertThat(healthLevelAfter - healthLevelBefore, is(3));
	}
	
	@Test
	public void shouldReturnEmpNumber() {
		String checkNumber = underTest.getEmpNumber();
		assertEquals(checkNumber, "2");
	}
	
	@Test
	public void shouldReturnEmpName() {
		String checkName = underTest.getEmpName();
		assertEquals(checkName, "name");
	}
	
	@Test
	public void shouldReturnNumPatietns() {
		int checkNumPatients = underTest.getNumPatients();
		assertEquals(checkNumPatients, 1);
	}
	
	@Test
	public void shouldGetPaid50k() {
		String check = underTest.calculatePay();
		assertEquals(check, "50,000");
	}
	
}
