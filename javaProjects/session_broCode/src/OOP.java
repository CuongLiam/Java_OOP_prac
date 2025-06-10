public class OOP {
    public static void oopMain(){
        Car myCar = new Car();
        Car myCar2 = new Car();

        System.out.println(myCar.make);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println();
        System.out.println(myCar2.make); // the same, can be different in constructor
        System.out.println(myCar2.model);
        System.out.println(myCar2.color);

        System.out.println("year + price is = "+ (myCar.year + myCar.price));

        myCar.drive();
        myCar.brake();
    }
}

class Car{
    String make =  "BMW";
    String model = "new";

    int year = 2025;
    String color = "white";
    int price = 50000;

    void drive() {
        System.out.println("ur driving");
    }

    void brake() {
        System.out.println("u braked!");
    }

}