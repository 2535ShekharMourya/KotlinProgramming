package DSA.DPSeries;

import java.util.Arrays;
import java.util.Scanner;

public class FiboDp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int dpArr[] = new int[n + 1];
        Arrays.fill(dpArr, -1);
        System.out.println(fiboWithDp(n, dpArr));
        System.out.println(fiboWithRecursion(n));
        System.out.println(tabulationFiboDp(n , dpArr));
        System.out.println(spaceOptTabulationFiboDp(n));
    }

    private static int tabulationFiboDp(int n, int[] dpArr) {
        dpArr[0]=0;
        dpArr[1]=1;     // TC=O(n) and SC=O(n)
        int result=0;
        for (int i=2;i<=n;i++){
            dpArr[i]=dpArr[i-1]+dpArr[i-2];
            result=dpArr[i];
        }
        return result;
    }

    private static int spaceOptTabulationFiboDp(int n) {
        int prev2=0;
        int prev=1;
        for (int i=2;i<=n;i++){
            int current_i=prev+prev2;      // TC=O(n)  and SC=O(1)
            prev2=prev;
            prev=current_i;
        }
        return prev;
    }

    private static int fiboWithRecursion(int n) {
        if (n <= 1) return n;
        return fiboWithRecursion(n - 1) + fiboWithRecursion(n - 2);
    }
    private static int fiboWithDp(int n, int[] dpArr) {
        if (n <= 1) return n;
        if (dpArr[n] != -1) return dpArr[n];  // TC=O(n) and SC=O(n) + O(n)
        return dpArr[n] = fiboWithDp(n - 1, dpArr) + fiboWithDp(n - 2, dpArr);
    }
}
