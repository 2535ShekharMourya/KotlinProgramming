package DSA.Time_Space_Complexity;

public class Example3ConsecutiveLoops {
    public static void main(String[] args) {
        // Ex1
        int n1 = 10;
        for (int i = 1; i <= n1; i++) {
            System.out.println("azad"); // => n times
        }
        for (int i = 1; i <= n1; i++) {
            System.out.println("azad");// => n times   total=n+n=2n or Tc=O(n)
        }
        //Ex2
        for (int i = 1; i <= n1; i++) {
            System.out.println("azad"); // => n times
        }
        for (int i = 1; i <= n1; i++) {
            for (int j = 1; j <= n1; j++) {
                for (int k = 1; k <= n1; k++) {
                    System.out.println("azad");// n^3 times. total = n + n^3.  Tc= O(n^3)
                }
            }
        }

    }
}
