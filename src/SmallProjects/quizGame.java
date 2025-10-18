package SmallProjects;

import java.util.Scanner;


public class quizGame {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //questions array
        String[] array = {"1. Who invented the first car?", "2. Who is the president of Monaco?", "3. When the first world war started?", "4. What is the fastest car on Earth?"};

        //options array
        String[][] options = {{"1. Thomas Edison", "2. Nikola Tesla", "3. Albert Einstein", "4. Carl Benz"},
                              {"1. Recep Tayyip Erdogan", "2. Albert II", "3. Barakh Obama", "4. Abraham Lincoln"},
                              {"1. 1943", "2. 1921", "3. 1918", "4. 1914"},
                              {"1. Aventador SVJ", "2. SF90", "3. Koenigsegg Jesko Absolut", "4. Bugatti Tourbillon"}};
        // variables
        int[] answers = {4, 2, 4, 3};
        int userInput;
        int score = 0;

        // welcome message
        System.out.println("--------------------------");
        System.out.println("Welcome to the Quiz Game!");
        System.out.println("--------------------------");


        // for loop here
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

            for( String option : options[i]) {
                System.out.println(option);
            }
            System.out.println("Choose one of the options:  ");
            userInput = scan.nextInt();

            if(userInput == answers[i]) {
                System.out.println("--------");
                System.out.println("CORRECT!");
                System.out.println("--------");
                score++;

            }
            else {
                System.out.println("--------");
                System.out.println("INCORRECT!");
                System.out.println("--------");
            }


        }
        scan.close();
        System.out.println("You guessed" + " " + score + " out of " + array.length + " correct");

    }
}