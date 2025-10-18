package FundamentalsTopics;
import java.util.Scanner;

public class search4Array {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String[] meyveler = {"alma", "sk", "armud", "şaftalı" };
        String meyve = scanner.nextLine();
        boolean isFound = false;

        for(int i = 0; i < meyveler.length; i++) {

            if(meyveler[i].equals(meyve)) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }


        if(!isFound) {
            System.out.println("Element not found.");
        }

        scanner.close();
    }

}