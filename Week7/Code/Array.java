package Week7;

import java.util.Arrays;
import java.util.Random;

public class Array {

    public static void main(String[] args) {
//        final int SIZE = 10;
//        String[] names = new String[SIZE];
//
//        int PLANETS_SIZE = 9;
//        String[] planets = { "Mercury", "Venus", "Mars", "Earth", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto" };
//        String[] planets = { "B", "d", "e", "A", "f" , "C" , "CA" , "CD"};
//        Arrays.sort(planets);
//        System.out.println(Arrays.toString(planets));
//
//        for (int index = 0; index < planets.length ; index++) {
//            System.out.println(planets[index].charAt(0));
//        }


//        int[] numbers = {88,44,99,55,72};
//        System.out.println(Arrays.toString(numbers));
//        Arrays.sort(numbers); // 44, 55, 72, 88, 99
//        System.out.println(Arrays.toString(numbers));
//        System.out.println(numbers[numbers.length - 1]);

//
//        final int SIZE = 3;
//        int[] numbers = new int[SIZE];
//        numbers[0] = 10;
//        numbers[1] = 15;
//        numbers[2] = 20;
//        numbers[3] = 25;
//        numbers[9] = 100;

//        int sum = 0;
//        int min = Integer.MAX_VALUE;
//        for (int index = 0; index < numbers.length ; index++) {
//        numbers[index] = index+1;
//        sum += numbers[index];
//        }
//
//        System.out.println(sum / numbers.length);


        int[] randomNumbers = new int[10];

        Random rand = new Random();

//        for (int i = 0; i < randomNumbers.length; i++) {
//            randomNumbers[i] = rand.nextInt(50);
//        }
//
//        int sum = 0;
//        for(int currentNumber : randomNumbers) sum += currentNumber;

//        for (int i = 0; i <= 3; i++) {
//            for (int j = 0; j <= 3; j++) {
//                System.out.print(i);
//                System.out.print(j);
//                System.out.print(",");
//            }
//            System.out.println();
//        }

        int[][] myNumbers = {
                {1, 2, 3, 4},  // INDEX = 0
                {5, 6, 7 , 4} }; // INDEX = 1

        // myNumbers[myNumbers.length-1] => {5, 6, 7 , 4}
        // [myNumbers[myNumbers.length-1].length => 4
        // myNumbers[1].length-1 => 3
        // myNumbers[1][3]

        int x = myNumbers[myNumbers.length-1][myNumbers[myNumbers.length-1].length-1];
        System.out.println(x);






    }

}
