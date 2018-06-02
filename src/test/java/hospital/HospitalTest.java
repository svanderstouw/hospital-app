package hospital;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.contains;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertThat;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;

public class HospitalTest {
	
	Hospital underTest;;
	
	@Before
	public void setup() {
		underTest = new Hospital();
	}
	
	@Test
	public void shouldBeAbleToAddEmployee() {
		Doctor doctor = new Doctor("1","","");
		underTest.addEmployee(doctor);
		Collection<Employee> check = underTest.getAllEmployees();	
		assertThat(check, contains(doctor));
	}

	@Test
	public void shouldBeAbleToAddTwoDifferentEmployees() {
		Doctor doctor = new Doctor("1","","");
		Nurse nurse = new Nurse("2","",0);
		underTest.addEmployee(doctor);
		underTest.addEmployee(nurse);
		Collection<Employee> check = underTest.getAllEmployees();	
		assertThat(check, containsInAnyOrder(nurse, doctor));
	}
	
	@Test
	public void shouldBeAbleToFindEmployeeByNumber() {
		Doctor doctor = new Doctor("1","Alice","");
		Nurse nurse = new Nurse("2","Tom",0);
		underTest.addEmployee(doctor);
		underTest.addEmployee(nurse);
		Employee retrievedEmployee = underTest.getEmployeeByNumber(doctor.getEmpNumber());
		assertThat(retrievedEmployee, is(doctor));
	}
	
	@Test
	public void shouldBeAbleToFindEmployeeByName() {
		Doctor doctor = new Doctor("1","Alice","");
		Nurse nurse = new Nurse("2","Tom",0);
		underTest.addEmployee(doctor);
		underTest.addEmployee(nurse);
		Employee retrievedEmployee = underTest.getEmployeeByName(doctor.getEmpName());
		assertThat(retrievedEmployee, is(doctor));
	}
	
}

