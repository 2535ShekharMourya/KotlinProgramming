package DSA.Recursion;

import java.util.ArrayList;

public class ReturnAList {
    //static ArrayList<Integer>list2=new ArrayList<>();  you can use this list in inside the function
    public static ArrayList findAllIndex(int arr[], int target, int ind, ArrayList<Integer> list) {
        if (ind == arr.length) {
            return list;
        }
        if (arr[ind] == target) {
            list.add(ind);
        }
        return findAllIndex(arr, target, ind + 1, list); // both list argument and list parameter same name but different Reference variable
    }

    public static void main(String args[]) {
        int arr[] = {2, 3, 1, 4, 4, 5};
        int target = 4;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> l = findAllIndex(arr, target, 0, list);//this function calling or this entire thing is 'list'
        System.out.println(list);
        System.out.println(l);
    }


}
