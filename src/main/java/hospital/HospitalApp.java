package hospital;

import java.util.Scanner;

public class HospitalApp {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		Hospital hospital = new Hospital();

		Doctor phil = new Doctor("1111", "Phil", "Brain");
		Surgeon harry = new Surgeon("2222", "Harry", "Heart", true);
		Nurse jackie = new Nurse("3333", "Jackie", 5);
		Receptionist janine = new Receptionist("4444", "Janine", false);
		Janitor rosie = new Janitor("5555", "Rosie", true);
		EmergencyDispatcher tina = new EmergencyDispatcher("6666", "Tina", false, true);
		
		hospital.addEmployee(phil);
		hospital.addEmployee(harry);
		hospital.addEmployee(jackie);
		hospital.addEmployee(janine);
		hospital.addEmployee(rosie);
		hospital.addEmployee(tina);
		
		System.out.println("Here are the employees at High St. Hospital:");
		hospital.showAllEmployeeStats();
		System.out.println();

		System.out.println("Here are the salary rates at the hospital:");
		hospital.showPayRates();
		System.out.println();
		
		System.out.println("Here are the employees who can give medical care:");
		hospital.showAllMedicalPersonnel();
		System.out.println();
		
		System.out.println("Enter employee name to search:");
		System.out.print("> ");
		String nameToSearch = input.nextLine();
		
		hospital.showAllEmployees();

	}

}
