import java.util.Scanner;

public class c2_scanner {
    public static void c2(){

        Scanner scanner  = new Scanner(System.in);

        System.out.println("who r u? ");
        String urName = scanner.nextLine();


        System.out.println("how old r u? ");
        int age = scanner.nextInt();

        scanner.nextLine(); //haha ez no \n

        System.out.println("definitely not gonna skip this");
        String str = scanner.nextLine();

        System.out.println("hi "+urName);
        System.out.println("hi "+age);
        System.out.println("hi str: "+str);
    }
}
