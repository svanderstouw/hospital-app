package hospital;

public class EmergencyDispatcher extends Receptionist implements MedicalDuties{

	private boolean isOnEmergencyCall;
	
	public boolean isOnEmergencyCall() {
		return isOnEmergencyCall;
	}
	
	public EmergencyDispatcher(String empNumber, String empName, boolean isOnPhone, boolean isOnEmergencyCall) {
		super(empNumber, empName, isOnPhone);
		this.isOnEmergencyCall = isOnEmergencyCall;
	}

	@Override
	public void administerCare(Patient patient) {
		patient.receiveHealth(5);	
	}
	
	@Override
	public String toString() {
		return getEmpName() + " " + getEmpNumber() + " " + isOnPhone + " " + isOnEmergencyCall;
	}

}
