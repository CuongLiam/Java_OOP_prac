public class c2_varArg {
    public static void c2_VarArgu(){
        int [] arr = {1,10,3,4,5};

        printMax(arr);
    }

    public static void printMax(int ... arr){
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

        System.out.println("the max res is :" +result);
    }
}
