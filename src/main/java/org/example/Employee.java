package org.example;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Employee {
    private String fullName;
    private Integer age;
    private String department;
    private Double salary;

    public Employee(String fullName, Integer age, String department, Double salary) {
        this.fullName = fullName;
        this.age = age;
        this.department = department;
        this.salary = salary;
    }

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Jack", 24, "Info", 1000.0));
        employees.add(new Employee("Jo", 54, "System", 3000.0));
        employees.add(new Employee("Jackson", 74, "HR", 7000.0));
        employees.add(new Employee("Johnson", 14, "MG", 500.0));
        employees.add(new Employee("JJ", 4, "Tech", 100.0));
        System.out.println(employees);
        employees.stream().collect(Collectors
                .toMap(Employee::getFullName, Employee::getDepartment))
                .forEach((name, department) -> System.out.println(String.format("Name: %s, Department: %s", name, department)));
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
