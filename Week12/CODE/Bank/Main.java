package Week12.Bank;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static void testA(int[] ages){
        System.out.println(ages);
        for (int i = 0; i < ages.length; i++) {
            ages[i] = ages[i] + 10;
        }
    }

    static int testA2(int age){

        age = age + 10;
        return age;
    }

    public static void testObj(BankAccount b1){
        b1.balance = 10;
    }

    public static void main(String[] args) {

    int[] ahmad = {20,30,40};
        System.out.println(ahmad);
        testA(ahmad);


        BankAccount a = new BankAccount();
        BankAccount b = new BankAccount();
        a.balance = 9999;
        System.out.println(a.balance);
        b = a;
        b.balance = 5;
        System.out.println(a.balance);



//        BankAccount zainCash = new BankAccount();
//        AccountHolder a1 = new AccountHolder();
//        a1.name = "Yaman";
//        a1.address = "Amman";
//        a1.phone = "021312312312";
//
//        zainCash.accountHolder = a1;
//        zainCash.balance = 1000;
//
//        BankAccount orangeMoney = new BankAccount();
//        orangeMoney.balance = 1000;
//
//        System.out.println(zainCash.toString());




    }

}
