package org.example;

import org.example.employeeTypes.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        while (true) {
            System.out.println("\nMENU:");
            System.out.println("1. Add New Employee");
            System.out.println("2. Remove Employee");
            System.out.println("3. View Employees");
            System.out.println("4. View Total Salary");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addEmployee(scanner, employees);
                    break;
                case 2:
                    removeEmployee(scanner, employees);
                    break;
                case 3:
                    viewEmployees(employees);
                    break;
                case 4:
                    viewTotalSalary(employees);
                    break;
                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }

    private static void addEmployee(Scanner scanner, ArrayList<Employee> employees) {
        System.out.println("\nAdd New Employee:");
        System.out.print("Enter name: ");
        String name = scanner.next();
        System.out.print("Enter last name: ");
        String lastName = scanner.next();
        System.out.print("Enter position (Manager, CEO, AnalysisProgrammer, SystemProgrammer, Salesman, Secretary): ");
        String position = scanner.next();
        System.out.print("Enter workspace: ");
        String workspace = scanner.next();
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter experience (in years): ");
        int experience = scanner.nextInt();

        Employee employee;
        switch (position) {
            case "Manager":
                employee = new Manager(name, lastName, position, workspace, salary, experience);
                break;
            case "CEO":
                employee = new CEO(name, lastName, position, workspace, salary, experience);
                break;
            case "AnalysisProgrammer":
                employee = new AnalysisProgrammer(name, lastName, position, workspace, salary, experience, new String[]{});
                break;
            case "SystemProgrammer":
                employee = new SystemProgrammer(name, lastName, position, workspace, salary, experience, new String[]{});
                break;
            case "Salesman":
                employee = new Salesman(name, lastName, position, workspace, salary, experience);
                break;
            case "Secretary":
                employee = new Secretary(name, lastName, position, workspace, salary, experience);
                break;
            default:
                System.out.println("Invalid position.");
                return;
        }

        employees.add(employee);
        System.out.println("Employee added successfully.");
    }

    private static void removeEmployee(Scanner scanner, ArrayList<Employee> employees) {
        System.out.println("\nRemove Employee:");
        System.out.print("Enter index of employee to remove: ");
        int index = scanner.nextInt();
        if (index >= 0 && index < employees.size()) {
            employees.remove(index);
            System.out.println("Employee removed successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private static void viewEmployees(ArrayList<Employee> employees) {
        System.out.println("\nEmployees:");
        for (Employee employee : employees) {
            System.out.println("\n------------------");
            employee.displayDetails();
        }
    }

    private static void viewTotalSalary(ArrayList<Employee> employees) {
        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.salary;
        }
        System.out.println("\nTotal Salary Paid: $" + totalSalary);
    }
}