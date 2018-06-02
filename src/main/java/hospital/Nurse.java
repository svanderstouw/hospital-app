package hospital;

public class Nurse extends Employee implements MedicalDuties {

	private int numPatients;
	
	public int getNumPatients() {
		return numPatients;
	}
	
	public Nurse(String empNumber, String empName, int numPatients) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.numPatients = numPatients;
	}

	@Override
	public void drawBlood(Patient patient) {
		patient.removeBlood(5);
	}

	@Override
	public void administerCare(Patient patient) {
		patient.receiveHealth(3);
	}

	@Override
	public String calculatePay() {
		return "50,000";
	}
	
	@Override
	public String toString() {
		return empName + " " + empNumber + " " + numPatients;
	}
}
