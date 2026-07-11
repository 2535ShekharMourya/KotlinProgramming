package DSA.Recursion;

import java.util.Arrays;

public class PatternBubblesortSelectionsortWithRecursion {
    public static void main(String args[]) {
        triangle(4, 0);
        triangle2(4, 0);
        int arr[] = {4, 3, 2, 1};
        BubbleSort(arr, arr.length - 1, 0);
        SelectionSort(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));

    }

    // Printing Reverse triangle
    static void triangle(int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            System.out.print("* ");
            triangle(row, col + 1);
        } else {
            System.out.println();
            triangle(row - 1, 0);
        }
    }

    // Printing Triangle
    static void triangle2(int row, int col) {
        if (row == 0) {
            return;
        }

        if (col < row) {

            triangle2(row, col + 1);
            System.out.print("* ");
        } else {

            triangle2(row - 1, 0);
            System.out.println();
        }
    }


    static void BubbleSort(int arr[], int row, int col) {
        if (row == 0) {
            return;
        }
        if (col < row) {
            if (arr[col] > arr[col + 1]) {
                int temp = arr[col];
                arr[col] = arr[col + 1];
                arr[col + 1] = temp;
            }
            BubbleSort(arr, row, col + 1);
        } else {
            BubbleSort(arr, row - 1, 0);

        }
    }


    static void SelectionSort(int arr[], int row, int col, int max) {
        if (row == 0) {
            return;
        }

        if (col < row) {
            if (arr[col] > arr[max]) {
                SelectionSort(arr, row, col + 1, col);
            } else {
                SelectionSort(arr, row, col + 1, max);
            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row - 1];
            arr[row - 1] = temp;
            SelectionSort(arr, row - 1, 0, 0);
        }
    }
}
