package org.example.employeeTypes;

public class CEO extends Manager {
    public CEO(String name, String lastName, String position, String workspace, double salary, int experience) {
        super(name, lastName, "CEO", workspace, salary, experience);
    }
}
