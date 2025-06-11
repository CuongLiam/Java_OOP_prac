public class c2_constVarAndMethods {
    public static void c2_main(){
        System.out.println("before creating objs");
        System.out.println("the num of circle objs is " +CircleWithStaticMember.numOfObjs);

        CircleWithStaticMember c1 = new CircleWithStaticMember();

        System.out.println("after creating c1");
        System.out.println("c1: radius is "+c1.radius+" and numOfObjs " +c1.numOfObjs); //since it shared the same static
                                                                                        //can write it like ln17

        CircleWithStaticMember c2 = new CircleWithStaticMember(2);

        c1.radius = 3;

        System.out.println("after creating c2 and modifying c1");
        System.out.println("c1: "+c1.radius + " numOfObjs " +CircleWithStaticMember.numOfObjs);

        System.out.println("c2: "+c2.radius+" numOfObjs "+CircleWithStaticMember.numOfObjs);

    }
}

class CircleWithStaticMember{
    double radius;

    static int numOfObjs = 0;

    CircleWithStaticMember(){
        radius = 1;
        numOfObjs++;
    }

    CircleWithStaticMember(double newRaidus){
        radius = newRaidus;
        numOfObjs++;
    }

    static int getNumOfObjs(){
        return numOfObjs;
    }

    double getArea(){
        return radius*radius*Math.PI;
    }
}
