import java.util.Random;

public class random {
    public static void rand(){
        Random random = new Random();

        int x = random.nextInt(6)+1; // 0 -> 5 neu khong + 1, vi may tinh bat dau tu 0
        double y = random.nextDouble(); // rand tu 0 den 1
        boolean z = random.nextBoolean();

        System.out.println(z);

    }
}
