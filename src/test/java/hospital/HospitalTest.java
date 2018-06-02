package hospital;

import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Test;

public class HospitalTest {
	
	Hospital hospital = new Hospital();
	
	@Test
	public void shouldBeAbleToAddEmployee() {
		Doctor doctor = new Doctor("1","","");
		hospital.addEmployee(doctor);
		Collection<Employee> check = hospital.getAllEmployees();	
		assertThat(check, contains(doctor));
	}

	@Test
	public void shouldBeAbleToAddTwoDifferentEmployees() {
		Doctor doctor = new Doctor("1","","");
		Nurse nurse = new Nurse("2","",0);
		hospital.addEmployee(doctor);
		hospital.addEmployee(nurse);
		Collection<Employee> check = hospital.getAllEmployees();	
		assertThat(check, containsInAnyOrder(nurse, doctor));
	}
	
	@Test
	public void shouldBeAbleToFindEmployee() {
		
	}
	
}
