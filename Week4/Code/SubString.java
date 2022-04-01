package week3;

import javax.swing.*;
import java.util.Calendar;
import java.util.Scanner;

public class SubString {

    public static void main(String[] args) {

        String plateNumber = "18-991239";
        String lastDigit =  "" + plateNumber.charAt(plateNumber.length()-1);
        String ld = plateNumber.substring(plateNumber.length()-2);
        System.out.println(ld);

        String tarmeez = plateNumber.substring(0,plateNumber.indexOf("-"));
        System.out.println(tarmeez);
        String nnn = plateNumber.substring(plateNumber.indexOf("-")+1);
        System.out.println(nnn);

//        String plate = JOptionPane.showInputDialog("ENTER THE PLATE NUMBER:");
//        int plateINT = Integer.parseInt(lastDigit);
//
//        final int TODAY = Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
//
//        if(plateINT % 2 == 0 ){ // PLATE IS EVEN
//            if(TODAY % 2 == 1) // DAY IS ODD
//                System.out.println("ALLOWED");
//            else // DAY IS EVEN
//                System.out.println("NOT ALLOWED");
//        }
//        else // PLATE IS ODD
//        {
//            if(TODAY % 2 == 0) // TODAY IS EVEN
//                System.out.println("ALLOWED");
//            else // TODAY IS ODD
//            System.out.println("NOT ALLOWED");
//        }




    }
}
