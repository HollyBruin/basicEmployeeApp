package org.example.employeeTypes;

import org.example.Employee;

public class Secretary extends Employee {
    public Secretary(String name, String lastName, String position, String workspace, double salary, int experience) {
        super(name, lastName, "Secretary", workspace, salary, experience);
    }
}
