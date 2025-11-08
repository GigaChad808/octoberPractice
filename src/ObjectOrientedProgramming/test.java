package ObjectOrientedProgramming;

public class test {
    public static void main(String[] args){
        // Employee Management System
        Manager manager1 = new Manager("Johnny", 1, 2000, 800);
        Developer developer1 = new Developer("David", 2, 4000, "Java");
        Intern intern1 = new Intern("Emma", 3, 1000, 3);


        Employee[] employees = {manager1, developer1, intern1};

        for(int i = 0; i < employees.length; i++){
            employees[i].calculateSalary();
            employees[i].getDetails();
            System.out.println();
        }

    }
}
