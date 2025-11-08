package ObjectOrientedProgramming;

public class Employee {
    String name;
    int employeeId;
    int baseSalary;

    Employee(String name, int employeeId, int baseSalary){
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    void calculateSalary() {
        // why we write this.baseSalary here?
        System.out.println("Base Salary: " + this.baseSalary);
    }

    void getDetails(){
        System.out.println("Name of the Employee: " + this.name);
        System.out.println("Employee ID: " + this.employeeId);
    }



}
