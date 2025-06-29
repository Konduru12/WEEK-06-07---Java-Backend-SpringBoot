package com.spring.core.beans;

import org.springframework.stereotype.Component;

@Component  
public class Employee {
    private String name;
    private int id;

    public Employee() {
        this.name = "Abhinaya";
        this.id = 101;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void printEmployeeDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name);
    }
}
