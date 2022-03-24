package Lesson8;

public class Vehicle {
    public String make;
    public String model;
    public int year;
    public String color;


    public void start(){
        System.out.println(make+" "+model+" has been started");

    }
    public void beep(){
        System.out.println(this.color+ " car beeped");
    }
}
