package org.example;
import java.util.Scanner;
public class Employee {
    Scanner scanner = new Scanner(System.in);
        String name;
        String lastName;
        String position;
        String workspace;
        double salary;
        int experience;

        public Employee (String name, String lastName, String position, String workspace, double salary, int experience) {
            this.name = name;
            this.lastName = lastName;
            this.position = position;
            this.workspace = workspace;
            this.salary = salary;
            this.experience = experience;
        }

        public void displayDetails(){
            System.out.println("Name: " + name + " " + lastName);
            System.out.println("Position: " + position);
            System.out.println("Workspace: " + workspace);
            System.out.println("Salary: " + salary);
            System.out.println("Experience: " + experience + " years");
        }




}
