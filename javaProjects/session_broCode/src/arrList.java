import java.util.ArrayList;

public class arrList {
    public static void arrListMain(){
        // store reference data types
        ArrayList<String> food = new ArrayList<String>();

        food.add("pizza");
        food.add("ham");
        food.add("hotdog");

        food.set(1, "sushi"); //useful methods
//        food.remove(0);
//        food.clear();

        for (int i = 0; i < food.size(); i++){
            System.out.println(food.get(i));
        }

    }
}
