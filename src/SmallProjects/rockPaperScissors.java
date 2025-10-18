package SmallProjects;

import java.util.Scanner;
import java.util.Random;


public class rockPaperScissors {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter you move (rock, paper, scissors): ");
        // userInput
        String userInput = scan.nextLine();

        String[] choices = {"paper", "scissors", "rock"};
        // computerChoice
        String computerChoice = choices[random.nextInt(choices.length)];
        System.out.print("Computer choice: " + computerChoice);
        System.out.println();

        // if else
        if(computerChoice.equals(userInput)) {
            System.out.println("-----");
            System.out.println("DRAW!");
            System.out.println("-----");
        }
        else if (userInput.equals("paper") && computerChoice.equals("scissors")){
            System.out.println("-----");
            System.out.println("LOSE");
            System.out.println("-----");
        }
        else if (userInput.equals("paper") && computerChoice.equals("rock")){
            System.out.println("-----");
            System.out.println("WIN");
            System.out.println("-----");
        }
        else if (userInput.equals("scissors") && computerChoice.equals("paper")) {
            System.out.println("-----");
            System.out.println("WIN");
            System.out.println("-----");
        }
        else if (userInput.equals("scissors") && computerChoice.equals("rock")) {
            System.out.println("-----");
            System.out.println("LOSE");
            System.out.println("-----");
        }
        else if (userInput.equals("rock") && computerChoice.equals("scissors")) {
            System.out.println("-----");
            System.out.println("LOSE");
            System.out.println("-----");
        }
        else if(userInput.equals("rock") && computerChoice.equals("paper")) {
            System.out.println("-----");
            System.out.println("WIN");
            System.out.println("-----");
        }



        scan.close();
    }

}
