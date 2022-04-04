package Week5;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//
//        int age = -1;
//        int sum = 0;
//        int counter = 0;
//        while(age != 0){
//            age = input.nextInt();
//            if(age == 0) continue;
//            counter++;
//            sum += age;
//        }
//
//        double avg =  sum / counter;
//        System.out.println("AVG="+ avg);


        int[] arr = {9,12,33,1,4};
        int max = arr[0];
        for (int i = 0; i < 5; i++) {
            int userInput = input.nextInt();

             if(userInput> max) max = userInput;
        }

        System.out.println(max);

    }
}
