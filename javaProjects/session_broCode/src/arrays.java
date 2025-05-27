public class arrays {
    public static void c3_arr(){

        String[] cars = {
                "tesla",
                "toyota",
                "tesla",
                "bmw"
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


        System.out.println(length);
        System.out.println(cars[3]);
    }
}
