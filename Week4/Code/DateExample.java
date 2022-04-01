package week3;

import java.util.Calendar;
import java.util.Scanner;

public class DateExample {

    public static void main(String[] args) {

        Calendar myDate = Calendar.getInstance();
        int dayOfTheWeek = myDate.get(Calendar.DAY_OF_WEEK);
        if(dayOfTheWeek == Calendar.FRIDAY)
        System.out.println(dayOfTheWeek);

    }

}

