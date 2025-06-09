public class c2_sortArr {
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length - i - 1; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void c2_sort_main(){
        int[] arr = {1,2,7,4,5,2,7,9,10,21,42};

        bubbleSort(arr);

        for (int i : arr){
            System.out.println(i);
        }
    }
}
