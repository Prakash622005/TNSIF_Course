package com.prakash.assignment.utilities;

import com.prakash.assignment.employees.Employee;

/**
 * Utility class for employee-related operations.
 */
public class EmployeeUtilities {

    /**
     * Displays employee details.
     */
    public static void displayEmployeeDetails(Employee employee) {
        System.out.println("Name: " + employee.getName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
        System.out.println("Salary: " + employee.getSalary());
    }

    /**
     * Increases employee salary.
     */
    public static void incrementSalary(Employee employee, double increment) {
        double newSalary = employee.getSalary() + increment;
        employee.setSalary(newSalary);
    }
}
