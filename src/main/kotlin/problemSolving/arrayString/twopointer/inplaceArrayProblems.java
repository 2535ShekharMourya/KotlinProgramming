package problemSolving.arrayString.twopointer;

import java.util.Arrays;

public class inplaceArrayProblems {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 1, 2, 2, 3};
        removeDuplicates(arr);

    }

        public static void reverseIntArray(int[] arr) {
       // ip: [1, 2, 3, 4, 5]  op:[5, 4, 3, 2, 1]
            int left = 0, right = arr.length - 1;
            while (left < right) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
            System.out.printf(Arrays.toString(arr));
        }

    public static int removeDuplicates(int[] nums) {
        // ip: [1, 1, 2, 2, 3] op: [1, 2, 3]
        if (nums.length == 0) return 0;
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}
