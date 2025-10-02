package SmallProjects;
import java.util.Scanner;
import java.util.Random;

public class diceRoll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        // declare variables
        int numOfDices;
        int total = 0;

        System.out.print("Please an enter number of dices: ");
        numOfDices = input.nextInt();

        // Validate that number of dices can't be less than or equal to 0.
        if(numOfDices <= 0){
            System.out.println("Please enter a valid number!");
        }
        else {
            for(int i = 0; i < numOfDices; i++) {
                int roll = random.nextInt(1, 7);
                eachPieceOfdie(roll);
                System.out.println("Dice Rolled: " + roll);
                total += roll;
            }
            System.out.print("Sum of dices rolled: " + total);
        }
        input.close();
    }
    static void eachPieceOfdie(int roll){
        String dice1 =
                """
                 -------
                |       |
                |   ●   |
                |       |
                 -------
                """;
        String dice2 =
                """
                 -------
                | ●     |
                |       |
                |     ● |
                 -------
                """;
        String dice3 =
                """
                 -------
                | ●     |
                |   ●   |
                |     ● |
                 -------
                """;
        String dice4 =
                """
                 -------
                | ●   ● |
                |       |
                | ●   ● |
                 -------
                """;
        String dice5 =
                """
                 -------
                | ●   ● |
                |   ●   |
                | ●   ● |
                 -------
                """;
        String dice6 =
                """
                 -------
                | ●   ● |
                | ●   ● |
                | ●   ● |
                 -------
                """;

        switch(roll) {
            case 1 -> System.out.println(dice1);
            case 2 -> System.out.println(dice2);
            case 3 -> System.out.println(dice3);
            case 4 -> System.out.println(dice4);
            case 5 -> System.out.println(dice5);
            case 6 -> System.out.println(dice6);
            default -> System.out.println("Invalid choice!");
        }
    }
}