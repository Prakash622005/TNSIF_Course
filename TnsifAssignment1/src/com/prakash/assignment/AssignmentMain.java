package com.prakash.assignment;

import com.prakash.assignment.employees.Manager;
import com.prakash.assignment.employees.Developer;
import com.prakash.assignment.utilities.EmployeeUtilities;

/**
 * Main class to test the assignment.
 */
public class AssignmentMain {

    public static void main(String[] args) {

        Manager manager = new Manager("Ravi", 101, 60000, "HR");
        Developer developer = new Developer("Anita", 102, 50000, "Java");

        System.out.println("Manager Details:");
        EmployeeUtilities.displayEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());

        System.out.println("\nDeveloper Details:");
        EmployeeUtilities.displayEmployeeDetails(developer);
        System.out.println("Language: " + developer.getProgrammingLanguage());

        EmployeeUtilities.incrementSalary(manager, 5000);
        EmployeeUtilities.incrementSalary(developer, 3000);

        System.out.println("\nAfter Salary Increment:");
        EmployeeUtilities.displayEmployeeDetails(manager);
        System.out.println("Department: " + manager.getDepartment());

        EmployeeUtilities.displayEmployeeDetails(developer);
        System.out.println("Language: " + developer.getProgrammingLanguage());
    }
}
