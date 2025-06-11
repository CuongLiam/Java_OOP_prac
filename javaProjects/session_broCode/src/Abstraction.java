public class Abstraction {
    public static void abS_main(){
        // abstract - abs classes cannot be instantiated, but they can have a subclass

//        Vehicle vehicle = new Vehicle(); // Vehicle' is abstract; cannot be instantiated
        CarAbs car = new CarAbs();

        car.go();
    }
}

abstract class Vehicle{

    abstract void go(); // k duoc implement gi khac
}

class CarAbs extends Vehicle{

    @Override
    void go(){ // rat thu vi, abstract method ep minh phai implement o subclasses
        System.out.println("driving a car");
    }
}
