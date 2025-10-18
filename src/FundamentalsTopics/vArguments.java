package FundamentalsTopics;

// varags = makes method to accept as much as arguments as possible
//           it provides a unique approach to the overloaded methods.
// e.g. static string movies(String... movieNames)



public class vArguments {
    public static void main(String[] args){



//        System.out.println(add(1,2,3,4,5,6));
        System.out.println(average(902,858));
    }

    static double average(double... numbers){
        double sum = 0;

        for(double number : numbers) {
            sum += number;

        }
        return sum/numbers.length;
    }

//    static int add(int... numbers){
//        int sum = 0;
//
//        for(int number : numbers){
//            sum += number;
//        }
//        return sum;
//
//    }
}
