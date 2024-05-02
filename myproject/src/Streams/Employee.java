package Streams;

import java.util.*;
import java.util.stream.*;
 
class Employee {
    private int id;
    private String name;
    private double salary;
 
    // Constructor, getters and setters
 
    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
 
    public int getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
 
    public double getSalary() {
        return salary;
    }
 
    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
 
