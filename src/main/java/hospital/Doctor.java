package hospital;

public class Doctor extends Employee implements MedicalDuties {

	private String specialty;

	public String getSpecialty() {
		return specialty;
	}

	public Doctor(String empNumber, String empName, String specialty) {
		super(empNumber, empName);
		this.specialty = specialty;
	}

	@Override
	public void administerCare(Patient patient) {
		patient.receiveHealth(5);
	}

	@Override
	public String calculatePay() {
		return "90,000";
	}

	@Override
	public String toString() {
		return getEmpName() + " " + getEmpNumber() + " " + specialty;
	}
}
