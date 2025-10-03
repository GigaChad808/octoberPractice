package FundamentalsTopics;

import java.util.Arrays;

public class arraysR {
    public static void main(String[] args){
        // arrays = a collection of values of the same data type
        // * think of it as a variable that can store mor ethan 1 value *

        String[] fruits = {"apple", "banana", "orange", "coconut"};

//        fruits[0] = "pineapple";
//        Arrays.sort(fruits);
//        Arrays.fill(fruits, "pineapple");


        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
