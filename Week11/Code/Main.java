package Week11;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {



        Car myCar = new Car();
        myCar.type = "Mercedes";
        myCar.model = "S500";
        myCar.dateManufactured = new Date();
        myCar.color = "Black";

        Car myCar2 = new Car();
        myCar2.type = "Kia";

        myCar.move(20);
        myCar.move(10);
        myCar2.move(30);
        myCar2.move(10);

        System.out.println(myCar2.getSpeed());

        System.out.println(myCar.dateManufactured);


    }
}