package problemSolving.LinkedList;

import java.util.Arrays;

public class MainLinkedListJ {
    public static void main(String[]args){



    }


    public static void problemsWithArray(){
        int[] arr= new int[]{3,5,8,9,8,8,1,2,0,0};

        int index = 3;   // where to insert
        int value = 19;

// shift elements to the right
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

// insert new value
        arr[index] = value;

// print array
        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}


