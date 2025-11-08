package ObjectOrientedProgramming;

public class Developer extends Employee{
    String programmingLanguage;

    Developer(String name, int employeeId, int baseSalary, String programmingLanguage){
        super(name, employeeId, baseSalary);
        this.programmingLanguage = programmingLanguage;
    }

    void writeCode(){
        System.out.println("I am using " + programmingLanguage + " programming language to write code.");
    }
}
