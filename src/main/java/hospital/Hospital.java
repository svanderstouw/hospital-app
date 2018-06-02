package hospital;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Hospital {

	Map<String, Employee> employees = new HashMap<>();

	public void addEmployee(Employee employee) {
		employees.put(employee.getEmpNumber(), employee);
	}
	
	public Employee findEmployee(String findName) {
		return employees.get(findName);
	}

	public Collection<Employee> getAllEmployees() {
		return employees.values();
	}

	public void showPayRates() {
		for (Employee employee : employees.values()) {
			System.out.println(
					employee.getEmpName() + " gets paid a salary of $" + employee.calculatePay() + " per year.");
		}
	}

	public void showAllMedicalPersonnel() {
		for (Employee employee : employees.values()) {
			if (employee instanceof MedicalDuties) {
				System.out.println(employee.getEmpName());
			}
		}
	}

	public void showAllEmployeeStats() {
		ArrayList<Employee> employeesList = new ArrayList<>(employees.values());
		for (Employee employee : employeesList) {
			System.out.println(employee.toString());
		}
	}

	public void showAllEmployees() {
		ArrayList<Employee> employeesList = new ArrayList<>(employees.values());
		System.out.println("Unsorted:");
		for (Employee employee : employees.values()) {
			System.out.println(employee.getEmpName() + " " + employee.getEmpNumber());
		}
		System.out.println();
		System.out.println("Sorted:");
		Collections.sort(employeesList);
		for (Employee employee : employeesList) {
			System.out.println(employee.getEmpName() + " " + employee.getEmpNumber());
		}

	}

}
