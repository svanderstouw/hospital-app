package hospital;

public class Surgeon extends Doctor {

	private boolean isOperating;

	public boolean isOperating() {
		return isOperating;
	}
	
	public Surgeon(String empNumber, String empName, String specialty, Boolean isOperating) {
		super(empNumber, empName, specialty);
		this.isOperating = isOperating;
	}
	
	@Override
	public String calculatePay() {
		return "120,000";
	}
	
	@Override
	public String toString() {
		return getEmpName() + " " + getEmpNumber() + " " + getSpecialty() + " " + isOperating;
	}
	
}
