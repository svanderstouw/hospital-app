package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DoctorTest {
	
	Doctor underTest = new Doctor("1","name","area");
	Patient patient = new Patient();
	
	// test on state verification (variables)
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
		assertEquals(checkNumber, "1");
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
	public void shouldGetPaid90k() {
		String check = underTest.calculatePay();
		assertEquals(check, "90,000");
	}
}
