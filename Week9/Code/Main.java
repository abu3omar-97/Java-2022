package Week9;

import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog("ENTER A NUMBER TO GET THE RESULT SQUARED:"));
        int result = squared(num) + squared(num-1);
        int result2 = (num*num) + ((num-1) * (num-1));
        System.out.println(result);


    }

    public static int squared(int num){
        return num * num;
    }

}
