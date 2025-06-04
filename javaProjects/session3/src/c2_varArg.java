public class c2_varArg {
    public static void c2_VarArgu(){
        int [] arr = {1,10,3,90,5};

        printMax(arr);
        printMax(1,2,3,4,5);

    }

    public static void printMax(int ... arr){ // ... operator Concept: Variable-Length Argument List (...)
//                                                  In Java, you can pass a variable number of arguments to a method using ....
//                                                  These arguments are treated as an array inside the method.
        if (arr.length ==  0){
            System.out.println("no arg passes !");
            return;
        }
        int result = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > result){
                result = arr[i];
            }
        }

        System.out.println("the max res is : " +result);
    }
}
