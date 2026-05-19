package designImpAndProblemSolving;

import java.lang.reflect.Array;
import java.util.*;

public class ProblemSolvingJava {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int []nums = new int[]{3,2,2,3};
       solveProblem(nums);


//        char b = sc.nextLine().charAt(0);
//        System.out.println("character is "+b);
       // int n = sc.nextInt();
//       // sc.nextLine();   // must add this0,1,2,2,3,0,4,2
//        String str = sc.nextLine();
//        inputString(str);
//               int T = sc.nextInt();
//        System.out.println("no of Test Cases "+T);
//               int n= sc.nextInt();
//        System.out.println("Array Length " +n);
//        int []numArr= new int[n];
//               for (int i=1;i<=T;i++){
//                   for (int j=0;j<n;j++){
//                       numArr[i]=sc.nextInt();
//                   }
//                   inputArr(numArr);
//               }
//               while (T-->0){
//                   int num =sc.nextInt();
//                   solveProblem(num);
//               }

    }
    public static void solveProblem(int []nums){
        int ind=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=2){
                nums[ind]=nums[i];
                ind++;
            }
        }
        System.out.println("length "+ ind);
        for (int i=ind;i<nums.length;i++){
            nums[ind]=0;
            ind++;
        }
        System.out.println("print "+ Arrays.toString(nums));

    }
    public static void inputString(String name){
        System.out.println("print "+ name);
    }
    public static void inputArr(int[] num){
        System.out.println("print "+ num);
    }
    public static void inputChar(int num){
        System.out.println("print "+ num);
    }








}











