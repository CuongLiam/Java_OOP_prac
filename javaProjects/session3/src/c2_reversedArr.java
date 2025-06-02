public class c2_reversedArr {
    public static int[] reverse(int[] arr){
        int[] result = new int[arr.length];

        for (int i = 0; i< arr.length ; i++){
                result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }
    public static void c2(){
        int[] arr1 = {1,2,3,4,5,6};
//        int[] arr2 =

        int[] arr2 = reverse(arr1);

        for (int i : arr2){
            System.out.println(i);
        }
    }
}
