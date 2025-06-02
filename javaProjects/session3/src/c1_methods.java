public class c1_methods {
    public static void c1(){
//        int result = sum(3, 7);
//
//        System.out.println(result);

        System.out.println("your grade is: ");
        grade(9.7);

    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static void grade(double score){
        if (score >= 9.0){
            System.out.println('A');
        } else if(score >= 8.0){
            System.out.println('B');
        }// ....
        else{
            System.out.println("ok");
        }
    }
}
