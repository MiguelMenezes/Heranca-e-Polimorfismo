package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number of employees: ");
		int num = sc.nextInt();

		List<Employee> lista = new ArrayList<>();

		for (int i = 1; i <= num; i++) {

			System.out.println("EMPLOYEE #" + i + " DATA: ");
			System.out.println("Outsourced (Y/N)? ");
			String outSourced = sc.next();
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Hours: ");
			int hours = sc.nextInt();
			System.out.println("Value per Hour: ");
			double valuePerHour = sc.nextDouble();

			if (outSourced.equalsIgnoreCase("Y")) {
				System.out.print("Additional Charge: ");
				double additionalCharge = sc.nextDouble();
				Employee emp = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
				lista.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				lista.add(emp);
			}
		}

		System.out.println("PAYMENTS: ");
		for (Employee emp : lista) {
			System.out.println(emp.getName() + " - $" + emp.payment());
		}
		sc.close();
	}

}
