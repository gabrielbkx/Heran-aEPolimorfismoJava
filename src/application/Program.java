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
        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee " + (i + 1) + " data: ");
            System.out.print("Outsourced (y/n)?");
            char s = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();

            if (s == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                //Upcasting. sem ele nós não podemos adicionar o empregado na lista do tipo Employee
                Employee employee = new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge);
                list.add(employee);
            }else {
                Employee employee = new Employee(name,hours,valuePerHour);
                list.add(employee);
            }
        }
        System.out.println("PAYMENTS: ");
        for (int i = 0 ; i < list.size();i++){
            System.out.println(list.get(i));

        }

        sc.close();
    }
}
