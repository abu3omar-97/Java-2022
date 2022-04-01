package week3;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int money = Integer.parseInt(JOptionPane.showInputDialog("How Much Do You Want To Deposit?"));
        System.out.println(money);

        int choice = JOptionPane.showConfirmDialog(null, "ARE YOU SURE YOU WANT PROCEED?");
        JOptionPane.showMessageDialog(null, "CHOICE: " + choice);

        if(choice == JOptionPane.YES_OPTION){
            System.out.println("DEPOSIT SUCCESS");
        }
        else if(choice == JOptionPane.NO_OPTION ||choice == JOptionPane.CANCEL_OPTION){
            System.out.println("DEPOSIT CANCELED");

        }


    }
}
