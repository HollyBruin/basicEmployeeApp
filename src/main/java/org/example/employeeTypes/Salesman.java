package org.example.employeeTypes;

import org.example.Employee;

public class Salesman extends Employee {
    public Salesman(String name, String lastName, String position, String workspace, double salary, int experience) {
        super(name, lastName, "Salesman", workspace, salary, experience);
    }
}
