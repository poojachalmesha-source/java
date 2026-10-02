public class PrimNonPrimitive {
    public static void main(String[] args) {
        int passingNum = 5;
        callingVariable(passingNum);
        System.out.println("After method call");
        System.out.println(passingNum);

        int[] arr1 = { 1, 2, 3, 4, 5 };
        callingArray(arr1);
        System.out.println("After method call");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i]);
        }
    }

    static void callingArray(int[] nums) {
        nums[2] = 9;
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    static void callingVariable(int num) {
        num++;
        System.out.println(num);
    }
}
