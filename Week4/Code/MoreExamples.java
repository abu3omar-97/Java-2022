package week3;

import javax.swing.*;

public class MoreExamples {
    public static void main(String[] args) {
        int myNumber = Integer.parseInt(JOptionPane.showInputDialog("ENTER ANY NUM:"));

        if(myNumber > 0) System.out.println(myNumber);
        else {
            System.out.println(myNumber * -1);
        }
    }
}
