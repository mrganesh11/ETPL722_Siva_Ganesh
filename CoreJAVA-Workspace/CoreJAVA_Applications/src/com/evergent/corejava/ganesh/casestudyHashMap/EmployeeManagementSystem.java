package com.evergent.corejava.ganesh.casestudyHashMap;

import java.util.HashMap;
import java.util.Map;

public class EmployeeManagementSystem {
    private HashMap<Integer, Employee> employeeMap;

    public EmployeeManagementSystem() {
        this.employeeMap = new HashMap<>();
    }

    // Add a new employee
    public void addEmployee(Employee employee) {
        employeeMap.put(employee.getId(), employee);
    }

    // Retrieve employee details using ID
    public Employee getEmployee(int id) {
        return employeeMap.get(id);
    }

    // Update employee information
    public void updateEmployee(Employee employee) {
        if (employeeMap.containsKey(employee.getId())) {
            employeeMap.put(employee.getId(), employee);
        } else {
            System.out.println("Employee with ID " + employee.getId() + " does not exist.");
        }
    }

    // Remove an employee
    public void removeEmployee(int id) {
        if (employeeMap.containsKey(id)) {
            employeeMap.remove(id);
        } else {
            System.out.println("Employee with ID " + id + " does not exist.");
        }
    }

    // List all employees
    public void listAllEmployees() {
        for (Map.Entry<Integer, Employee> entry : employeeMap.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

    public static void main(String[] args) {
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        // Adding employees
        system.addEmployee(new Employee(1, "Alice Johnson", "HR"));
        system.addEmployee(new Employee(2, "Bob Smith", "Engineering"));
        system.addEmployee(new Employee(3, "Charlie Brown", "Marketing"));

        // Listing all employees
        System.out.println("All Employees:");
        system.listAllEmployees();

        // Retrieving an employee
        System.out.println("\nRetrieving Employee with ID 2:");
        System.out.println(system.getEmployee(2));

        // Updating an employee
        System.out.println("\nUpdating Employee with ID 2:");
        Employee updatedEmployee = new Employee(2, "Bob Smith", "Product Management");
        system.updateEmployee(updatedEmployee);
        System.out.println(system.getEmployee(2));

        // Removing an employee
        System.out.println("\nRemoving Employee with ID 1:");
        system.removeEmployee(1);
        system.listAllEmployees();
    }
}
