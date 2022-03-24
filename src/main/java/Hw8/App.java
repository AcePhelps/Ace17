package Hw8;

public class App {
    public static void main(String[] args) {
        Computers aceComputer = new Computers();
        aceComputer.color = "Green";
        aceComputer.make = "Samsung";
        aceComputer.model = "T-528";
        aceComputer.year = 2021;
        TV aceTv = new TV();
        aceTv.color="black";
        aceTv.make="Hp";
        aceTv.model="T123";
        aceTv.year=1998;
        Dogs myDog = new Dogs();
        myDog.age=1;
        myDog.gender="Male";
        myDog.color="Brindle";
        myDog.name="Tony";

        Cats myCat = new Cats();
        myCat.age=0;
        myCat.color=null;
        myCat.gender=null;
        myCat.name=" ";

        System.out.println(myCat.color);
        System.out.println(aceTv.make);
        myDog.Speak();
    }
}
