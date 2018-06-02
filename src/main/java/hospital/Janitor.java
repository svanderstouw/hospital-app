package hospital;

public class Janitor extends Employee{

	private boolean isSweeping;

	public boolean isSweeping() {
		return isSweeping;
	}
	
	public Janitor(String empNumber, String empName, boolean isSweeping) {
		this.empNumber = empNumber;
		this.empName = empName;
		this.isSweeping = isSweeping;
	}

	@Override
	public String calculatePay() {
		return "40,000";
	}
	
	@Override
	public String toString() {
		return empName + " " + empNumber + " " + isSweeping;
	}
}
