package FundamentalsTopics;

public class search4Array {
    public static void main(String[] args){
        int[] numbers = {1, 9, 2, 8, 3, 5, 4};
        String[] fruits = {"apple", "orange", "banana"};
        String target = "pineapple";
        boolean isFound = false;

        for(int i = 0; i < numbers.length; i++) {
            if(fruits[i].equals(target)) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if(!isFound) {
            System.out.println("Element not found in the array: ");
        }
    }
}
