package FundamentalsTopics;

public class a2dArrays {
    public static void main(String[] args){
        String[][] phones = {{"Iphone17", "Iphone16", "Iphone15", "Iphone14", "Iphone13"},
                           {"Samsung24", "Samsung23", "Samsung22", "Samsung21","Samsung20"},
                           {"Huawe", "Xiami", "Honor"}};

        phones[2][0] = "Eylul";

        for(String[] phone : phones) {
            for(String aphone : phone) {
                System.out.print(aphone + " ");
                System.out.println();
            }
        }

    }
}