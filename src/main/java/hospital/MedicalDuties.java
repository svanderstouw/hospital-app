package hospital;

public interface MedicalDuties {

	public default void drawBlood(Patient patient) {
		patient.removeBlood(5);
	}

	void administerCare(Patient patient);

}