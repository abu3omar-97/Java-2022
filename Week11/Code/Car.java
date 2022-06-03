package Week11;

import java.util.Date;

public class Car {
    // WHAT IT HAS?
    int speed;
    String color;
    String model;
    String type;
    Date dateManufactured;

    // WHAT IT DOES?
    void move(int speed){
        if(speed < 0 ) return;
        this.speed += speed;
        this.speed = this.speed + speed;
        System.out.println( this.type + " IS MOVING @" + this.speed);
    }

    void stop(){
        this.speed = 0;
        System.out.println("THE CAR HAS IS STOPPING");
    }

    int getSpeed(){
        return this.speed;
    }
}
