package test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Employee e = new Employee("Venkat", 26, "IT");
		Employee e2 = new Employee("Sekar", 28, "BPO");
		Employee e3 = new Employee("Yuvaraj", 25, "IT");

		List<Employee> listOfEmployee = new ArrayList<>();
		listOfEmployee.add(e);
		listOfEmployee.add(e2);
		listOfEmployee.add(e3);
		System.out.println("listOf employee: " + listOfEmployee);
		listOfEmployee.sort(Comparator.naturalOrder());
		System.out.println("natural sorting listOf employee: " + listOfEmployee);
		listOfEmployee.sort(Comparator.reverseOrder());
		System.out.println("descending sorting listOf employee: " + listOfEmployee);
		Comparator<Employee> byName = (emp1, emp2)-> emp1.getName().compareTo(emp2.getName());
		listOfEmployee.sort(byName);
		System.out.println("by name : " + listOfEmployee);
	}

}
