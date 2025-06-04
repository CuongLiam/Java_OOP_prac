import java.util.Scanner;
import java.util.Arrays;

public class c2_arrSearch {
    public static void searchMain(){
        Scanner scanner = new Scanner(System.in);
        int [] arr = {1,2,3,7,90,4,5,6,100};
        int n = arr.length;

        Arrays.sort(arr); // binary search NEEDS TO BE SORTED FIRST

        System.out.print("arr = ");
        for (int i = 0; i < n; i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\nthe number u wanto find: ");
        int x = scanner.nextInt();

        int indexSearched = binarySearch(arr, n, x);
        if (indexSearched == -1){
            System.out.println("cannot find in the array");
        } else {
            System.out.printf("the index of %d is %d", x, indexSearched);
            }
    }

    public static int linearSearch(int [] arr, int n, int x){
        int xPos = -1;
        for (int i = 0; i< n; i++) {
            if (x == arr[i]){
                System.out.println("found it!");
                xPos += i +1;
                break;
            }
        }
        if (xPos == -1) {
            return -1;
        }

        return xPos;
    }

    public static int binarySearch(int [] arr, int n, int x){
        int low = 0;
        int high = n - 1;

        while (low <= high){
            int mid = (low + high)/2;

            if (x < arr[mid]){
                high = mid - 1;
            } else if (x == arr[mid]){
                System.out.println("found it");
                return mid;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
