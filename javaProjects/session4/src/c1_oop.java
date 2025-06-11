public class c1_oop {

    public static void c1_oop_main(){
        Circle c1 = new Circle();

        System.out.println(c1.getArea());

        Circle c2 = new Circle(2);

        System.out.println(c2.getArea());
    }

}

class Circle{
    double radius;
    final double PI = 3.14;

    Circle(){
        radius = 1;
    }

    Circle(double newRadius){ //  Constructors are a special kind of method. Constructors play the role of
//                                initializing objects
        radius = newRadius;
    }

    double getArea(){
        return radius*radius * PI;
    }

    double getPerimeter(){
        return 2*PI*radius;
    }

    void setRadius(double newRadius){
        radius = newRadius;
    }

}