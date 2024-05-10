package org.example.employeeTypes;

import org.example.Employee;

public class Programmer extends Employee {
    String [] technologies;
    public Programmer(String name, String lastName, String position, String workspace, double salary, int experience) {
        super(name, lastName, "Programmer", workspace, salary, experience);
        this.technologies = technologies;
    }

    @Override
    public void displayDetails () {
        super.displayDetails();
        System.out.println("Technologies: ");
        for (String tech : technologies){
            System.out.println("- " + tech);
        }
    }
}
