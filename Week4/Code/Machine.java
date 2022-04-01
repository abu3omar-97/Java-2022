package week3;

import javax.swing.*;

public class Machine {
    public static void main(String[] args) {

//        10: KitKat (0.5)
//        15: Oreo (0.25)
//        20: Ras Al-Abed (0.1)
//        25: Laban (0.5)

        final int KITKAT_CHOICE = 10;
        final double KITKAT_PRICE = 0.5;
        final int OREO_CHOICE = 15;
        final double OREO_PRICE = 0.25;

        String helloMsg = "WELCOME TO OUR MACHINE: \n" +
                "10: KitKat PRICE: (0.5)\n" +
                "15: Oreo PRICE: (0.25)\n" +
                "20: Ras Al-Abed PRICE: (0.1)\n" +
                "25: Laban PRICE: (0.5)";

        JOptionPane.showMessageDialog(null, helloMsg);
        int amount = Integer.parseInt(JOptionPane.showInputDialog("ENTER SOME MONEY"));
        int choice = Integer.parseInt(JOptionPane.showInputDialog("CHOOSE:"));

        if(choice == KITKAT_CHOICE){
            if(amount >= KITKAT_PRICE) {
                System.out.println("KITKAT ...");
            }
            else{
                System.out.println("ENTER MORE MONEY");
            }
        }
        else if(choice == OREO_CHOICE){
            if(amount >= OREO_PRICE) {
                System.out.println("OREO ...");
            }
            else{
                System.out.println("ENTER MORE MONEY");
            }
        }
        else {
            System.out.println("PLEASE ENTER A VALID NUMBER");
        }

    }
}
