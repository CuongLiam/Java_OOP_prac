public class c1 {
    public static void c1_basic() {
        String str1 = "oh hey";
        String str2 = "no go away";
        String temp;

        temp = str1;
        str1 = str2;
        str2 = temp;

        System.out.println("str1: "+str1);
        System.out.println("str2: "+str2);

        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        Integer a = 5;
        int x = 9;
        boolean hi = false;

        char ch = 'h';
        String str = "hi bro";

        System.out.println(str);
    }
}
