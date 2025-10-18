package SmallProjects;

import java.util.Scanner;
import java.util.Random;


public class rockPaperScissors{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        String userChoice;
        String[] choices = {"rock", "paper", "scissors"};
        String computerChoice = choices[random.nextInt(choices.length)];
        String playAgain = "yes";



        do {
            System.out.print("Choose one of the choice (rock, paper, scissors): ");
            userChoice = input.nextLine().toLowerCase().trim();
            System.out.println("Computer choice: " + computerChoice);


            if (!userChoice.equals("rock") && !userChoice.equals("scissors") && !userChoice.equals("paper")) {
                System.out.println("Invalid choice!");
                continue;
            }

            if (userChoice.equals(computerChoice)) {
                System.out.println("DRAW!");
            } else if (userChoice.equals("rock") && computerChoice.equals("scissors") ||
                    userChoice.equals("paper") && computerChoice.equals("paper") ||
                    userChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("WON!");
            } else {
                System.out.println("LOSE!");
            }

            System.out.print("You wanna keep play? (yes/no): ");
            playAgain = input.nextLine().toLowerCase().trim();


        } while(playAgain.equals("yes"));
        input.close();



    }
}

