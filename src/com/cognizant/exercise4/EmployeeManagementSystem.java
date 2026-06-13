package com.cognizant.exercise4;

public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int size){
        employees=new Employee[size];
        count=0;
    }
    public void addEmployee(Employee employee){
        if(count<employees.length){
            employees[count]=employee;
            count++;
            System.out.println("employee added");
        }
        else{
            System.out.println("employee not added");
        }
    }
    public Employee search(int employeeId){
        for(int i=0;i<employees.length;i++){
            if(employees[i].employeeId==employeeId){
                return employees[i];
            }
        }
        return null;
    }
    public void displayEmployees(){
        for(int i=0;i<count;i++){
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int employeeId) {

        int index = -1;

        for (int i = 0; i < count; i++) {

            if (employees[i].employeeId == employeeId) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Employee Not Found");
            return;
        }

        for (int i = index; i < count - 1; i++) {
            employees[i] = employees[i + 1];
        }

        employees[count - 1] = null;
        count--;

        System.out.println("Employee Deleted");
    }
}
