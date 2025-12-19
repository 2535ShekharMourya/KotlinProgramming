package problemSolving.arrayString.twopointer;

import java.util.HashMap;
import java.util.Map;

public class TwoPointerArraysProblemsJ {
    public static void main(String[] args) {
//        int []arr = new  int[]{2,7,11,15};
//        twoSum(arr,9,true);
        palindromeString("kayjfjskjak");
    }

 // elements sum = target
    public static void twoSum(int[] arr,int target, Boolean isSorted){
        //1st:  validate input and handle all edge cases
        if(arr.length<1)return;
        if (isSorted){
            twoSum167(arr,target);
        }else {
            twoSum1(arr,target);
        }
    }
    public static int[] twoSum1(int []arr,int target){
        // input: nums = [2,7,11,15], target = 9 output: [0,1] : Array is unSorted
        // Input: nums = [3,2,4], target = 6,   Output: [1,2]
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(arr[i], i);
        }

        return new int[]{}; // not found


    }
    public static void twoSum167(int []arr,int target){
        // ip: numbers = [2,7,11,15], target = 9, op:[1,2] : Array is sorted
        // Input: numbers = [2,3,4], target = 6 Output: [1,3]

// Brute approach
//        for (int i=0;i<arr.length;i++){
//            for (int j=i;j<arr.length;j++){
//                if (arr[i]+ arr[j]==target){
//                    System.out.printf(i +" " + j);
//                               return;

//                }
//            }
//        }

        // Optimal approach
        int start=0,end = arr.length-1;
        while (start<end){
            if(arr[start]+ arr[end]==target) {
                System.out.printf(start + " " + end);
                return;
            }
            if (arr[start]+ arr[end]<target)
            {start++;}
            if (arr[start]+ arr[end]>target){ end--;}

        }



    }

    // Palindrome
    public static void palindromeString(String str){
        // Entire String must be capital or small
        int start = 0 , end= str.length()-1;
        while (start<end){
            if (str.charAt(start) != str.charAt(end)) {
                System.out.printf("not palindrome");
                return;
            }else {
                start++;
                end--;
            }
        }

    }
}
