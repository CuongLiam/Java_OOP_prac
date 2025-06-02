public class  c2_arraysInMethods{
    public static void arraysInMethods(){
        int[] arr = {
                1,2,3,4,5
        };

        modify(arr); // mang cả địa chỉ của arr

        for (int i : arr){
            System.out.println(i);
        }

    }

    public static void modify(int[] arr){
        arr[0] = 100;
    }
}
