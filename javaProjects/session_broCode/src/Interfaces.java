public class Interfaces {
    public static void inter_main(){

        // interface - a template that can be applied to a class
        // giong voi inheritance, nhung ma cu the hoa a class has/must do
        // classes can apply more than 1 interface, inheritance chi co 1 super

//        Rabbit rabbit = new Rabbit();
//
//        rabbit.flee();

        Fish fish = new Fish();
        fish.flee();
        fish.hunt();


    }
}

class Rabbit implements Prey{
    @Override
    public void flee() {
        System.out.println("the rabbit is fleeing");
    }
}
class Snake implements Pred{
    @Override
    public void hunt() {
        System.out.println("the snake is hunting");
    }
}
class Fish implements Prey, Pred{
    @Override
    public void hunt() {
        System.out.println("the fish is hunting");
    }

    @Override
    public void flee() {
        System.out.println("the fish is fleeing");
    }
}

interface Prey{
    void flee();
}
interface Pred{
    void hunt();
}