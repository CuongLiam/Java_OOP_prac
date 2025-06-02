public class arrays {
    public static void c3_arr(){

//        String[] cars = {
//                "tesla",
//                "toyota",
//                "tesla",
//                "bmw"
//        };

//        String[] cars = new String[10];
         String [] cars = {
                 "tesla",
                 "bmw",
                "audi",
                "camero",
                 "mazda"
        };

        cars[0] = "cAr";
        int length = cars.length;

        int[] nums = new int[3];
        nums[0] = 2;
        nums[1] = 4;
        nums[2] = 6;

        for (int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }

//        for (int num : nums) {   // enhanced for?? woa
//            System.out.println(num);
//        }

        //System.out.println(length);
//        System.out.println(cars[3]);

        double[] randoms = new double[10];
        for (int i = 0; i < randoms.length; i++){
            randoms[i] = Math.random()*100;
        }

        for (double i : randoms){
            System.out.println(i);
        }

        // copying arrays
        int[] sourceArr = {1,2,3,4,5,6};

        int[] targetArr = new int[sourceArr.length];

        for (int i = 0 ; i < sourceArr.length; i++){
            targetArr[i] = sourceArr[i];
        }

        //shorter
        System.arraycopy(sourceArr, 0, targetArr, 0, sourceArr.length);



    }
}
