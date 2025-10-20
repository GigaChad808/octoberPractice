package SmallProjects;

import java.util.Scanner;
import java.util.Random;

public class slotMachine {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        // declare variables
        int balance = 100;
        int bet;
        int payout;
        String[] row;


        // displaying welcome message
        System.out.println("Welcome to Java Slots");
        System.out.println("Symbols: 🍒 🍉 🍋 🔔 ⭐");


        // play if balance is greater than 0
        while(balance > 0) {
            System.out.println("Current balance: $" + balance);
            // Enter bet amount
            System.out.print("Place your bet amount: ");
            bet = scan.nextInt();

            //  verify if bet > balance
            if( bet > balance) {
                System.out.println("INSUFFICIENT FUNDS");
                continue;
            }
            //  verify if bet > 0
            else if(bet <= 0) {
                System.out.println("Bet must be greater than 0");
                continue;
            }

            //  subtract bet from balance
            else {
                balance = balance - bet;
                System.out.println("$" + balance);
            }

            // Spin row
            System.out.println("Spinning.... ");
            row = spinRow();
            printRow(row);

            // get payout
            getPayout(row,bet);

        }




        // get payout
        // wanna play again?
        // displaying exit message

    }

    //Spin row
    static String[] spinRow() {

        String[] symbols = {"🍒", "🍉", "🍋", "🔔", "⭐"};
        String[] row = new String[3];
        Random random = new Random();



        for( int i = 0 ; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        return row;
    }

    // print row
    static void printRow(String[] row) {
        System.out.println(" " + String.join(" | ", row));
    }

    static int
}
