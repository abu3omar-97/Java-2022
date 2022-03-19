package week2;


import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//    String age = "47.3";
//    String name = "Yaman";
//    String post = "Feeling Happy with 3 others";

//        Scanner input = new Scanner(System.in);
////        System.out.println("ADD A NEW TWEET:");
////        String tweet = input.nextLine();
////        boolean isTweetValid = tweet.length() <= 280;
////        System.out.println(isTweetValid);

//        String name = "yaman";
//        char lastChar = name.charAt(name.length()-1);
//        System.out.println(lastChar);

//        String name = "YaMan";
//        name = name.toUpperCase();
//        System.out.println(name.toUpperCase());
//        System.out.println(name);

//        String age = " 123 ";
//        System.out.println(Integer.parseInt(age.trim()));

//        String name = "mohammad";
//        String firstChar = name.charAt(0) + "";
//        System.out.println(firstChar.toUpperCase());

//        String post = "Hello, I am travelling to Russia";
//        String post2 = "Hello, I am travelling to russia";
//        boolean isPostBlocked = post.toUpperCase().contains("RUSSIA");
//        System.out.println(isPostBlocked);

//        String sms = "I think that he will travel to Egypt after 3 days,  from there he will travel to USA.he";
//        System.out.println(sms.replace("he ", "she "));

        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF UNITS:");
        int units = input.nextInt();
        double totalPrice = 0;
        final int PRICE_FOR_500 = 100;

        if(units >= 0 && units <= 500){
            totalPrice = units * 0.2;
        }
        else if(units >= 500 && units <= 1000){
            totalPrice = 100 + (units - 500) * 0.5;
        }
        else if( units > 1000){
            totalPrice = 100 + 250 + (units - 1000) * 0.8;
        }

        totalPrice += 5; // ADDITIONAL FEES
        totalPrice *= 1.2; // TAX


    }
}
