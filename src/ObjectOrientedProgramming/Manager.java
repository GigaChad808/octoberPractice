package ObjectOrientedProgramming;

public class Manager extends Employee{
    int bonus;

    Manager(String name, int employeeId, int baseSalary, int bonus){
        super(name, employeeId, baseSalary);
        this.bonus = bonus;
    }

    @Override
    void calculateSalary(){
        System.out.println("Base Salary: " + (baseSalary + bonus));
    }

    void approveLeave() {
        // lol I don't know what to print.
        System.out.println("Your leave request approved!");
    }
}
