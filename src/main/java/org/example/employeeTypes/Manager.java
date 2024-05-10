package org.example.employeeTypes;

import org.example.Employee;

public class Manager extends Employee {

    public Manager(String name, String lastName, String position, String workspace, double salary, int experience) {
        super(name, lastName, "Manager", workspace, salary, experience);
    }
}
