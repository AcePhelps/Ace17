package Lesson8;

public class App {
    public static void main(String[] args) {
        Person david = new Person();
        david.name = "David";
        david.lastName = "Willson";
        david.year = 1995;
        david.introduce("Anna");

        Person jane = new Person();
        jane.name = "Jane";
        jane.lastName = "Calson";
        jane.year = 1997;
        System.out.println(jane.lastName);
        jane.introduce("Eric");

        Vehicle myCar = new Vehicle();
        myCar.make = "Toyota";
        myCar.color = "Yellow";
        myCar.year = 2008;
        myCar.model = "Prius";

        Vehicle assetCar = new Vehicle();
        assetCar.model = "Accord";
        assetCar.make = "Honda";
        assetCar.year = 2019;
        assetCar.color = "Silver";

        System.out.println(myCar.color);
        System.out.println(assetCar.color);
        myCar.start();
        assetCar.start();
        assetCar.beep();

    }
}
