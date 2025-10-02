package SmallProjects;

import java.util.Scanner;


public  class SmallBankingProgram {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args){

        double balance = 0;
        boolean keepRunning = true;

        while(keepRunning) {
            System.out.println("Small Banking Program");
            System.out.println("Please choose one of the options (1-4) below: ");
            System.out.println("1. View the balance.");
            System.out.println("2. Withdraw money.");
            System.out.println("3. Deposit money.");
            System.out.println("4. Exit the program");

            switch(input.nextInt()) {
                case 1:
                    System.out.println("$" + balance);
                    break;
                case 2:
                    balance = balance - withdrawMoney(balance);
                    break;

                case 3:
                    balance = balance + depositMoney(balance);
                    break;

                case 4:
                    System.out.println("Thank you for using Small Banking Program!");
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Please select correct option!");
                    break;
            }
        }
        input.close();
    }

    static double withdrawMoney(double balance) {
        double withdrawnAmount;
        System.out.println("Enter an amount to be withdrawn: ");
        withdrawnAmount = input.nextDouble();

        if(withdrawnAmount > balance || withdrawnAmount == 0 || withdrawnAmount < 0) {
            System.out.println("Please enter a valid amount");
            return 0;
        }
        else return withdrawnAmount;
        }

    static double depositMoney(double balance) {
        double depositedAmount;
        System.out.println("Enter an amount to be deposited: ");
        depositedAmount = input.nextDouble();

        if(depositedAmount <= balance) {
            System.out.println("Please enter an valid amount.");
            return 0;
        }
        return depositedAmount;
    }





}