package hospital;

public class Receptionist extends Employee {
	
	protected boolean isOnPhone;

	public boolean isOnPhone() {
		return isOnPhone;
	}
	
	public Receptionist(String empNumber, String empName, boolean isOnPhone) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.isOnPhone = isOnPhone;
	}

	@Override
	public String calculatePay() {		
		return "45,000";
	}
	
	@Override
	public String toString() {
		return empName + " " + empNumber + " " + isOnPhone;
	}
}
