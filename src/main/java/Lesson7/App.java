package Lesson7;

public class App {
    public static void main(String[] args) {
        Colors car = Colors.RED;
        car = Colors.BLUE;
        car = Colors.GREY;
        ace();

        System.out.println(car);

        SchoolType bostonHigh = SchoolType.PUBLIC;
        Homes toSell = Homes.HOMES;

        Homes toSell1 = Homes.APARTMENTS;

    }
    public static void ace() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ellie is very smart");
        }
    }
}
