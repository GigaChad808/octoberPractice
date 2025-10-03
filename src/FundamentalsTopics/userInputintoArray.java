package FundamentalsTopics;

import java.util.Scanner;

public class userInputintoArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an amount of food you want to eat: ");
        String[] foods = new  String[input.nextInt()];
        input.nextLine();

        for(int i = 0; i < foods.length; i++) {
            System.out.println("Enter a food: ");
            foods[i] = input.nextLine();
        }

        for(String food : foods) {
            System.out.println(food);
        }

        input.close();

    }
}