package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + " data: ");
            System.out.print("Outsourced (y/n)?");
            String s = sc.next();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (s.equalsIgnoreCase("y")) {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee employee = new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge);
                employees.add(employee);
            }else {
                Employee employee = new Employee(name,hours,valuePerHour);
                employees.add(employee);
            }
        }
        System.out.println("PAYMENTS: ");
        for (int i = 0 ; i < employees.size();i++){
            System.out.println(employees.get(i));

        }

        sc.close();
    }
}
