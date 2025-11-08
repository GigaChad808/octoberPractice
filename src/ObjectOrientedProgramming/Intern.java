package ObjectOrientedProgramming;

public class Intern extends Employee{
    int monthsOfInternship;

    Intern(String name, int employeeId, int baseSalary, int monthsOfInternship){
        super(name, employeeId, baseSalary);
        this.monthsOfInternship = monthsOfInternship;
    }

    @Override
    void calculateSalary(){
        System.out.println("Base Salary: " + (baseSalary/2));
    }

}
