package hospital;

public class Patient {

	private static final int BLOOD_LEVEL = 20;
	private static final int HEALTH_LEVEL = 10;
	
	private int bloodLevel = BLOOD_LEVEL;
	private int healthLevel = HEALTH_LEVEL;

	public int getBloodLevel() {
		return bloodLevel;
	}

	public int getHealthLevel() {
		return healthLevel;
	}
	
	public void removeBlood(int amount) {
		bloodLevel -= amount;
	}

	public void receiveHealth(int amount) {
		healthLevel += amount;	
	}

}
