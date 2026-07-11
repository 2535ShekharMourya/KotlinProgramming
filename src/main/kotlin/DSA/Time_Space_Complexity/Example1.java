package DSA.Time_Space_Complexity;

public class Example1 {
    public static void main(String[] args) {
        // Ex1:
        int n1 = 20;
        for (int i = 1; i <= n1; i++) {
            if (i == 20) System.out.println("sai hai");
            else System.out.println("try again");
            /* int i=1 -> a, i<=1 -> b, i++ -> c, for(){} -> d
            1. a-> i=1.                1 times                           flow of for loop: 1->2->3->4
            2. b-> i=1,2,3,4 . . . . .n,n+1.  n+1 times
            3. d-> n times executes
            4. c-> i=2,3,4 . . . . n,n+1 and total n times
           **in time complexity analysis only d portion consider means how many times d portion executes**
           * */
        }
        System.out.println();

        // Ex2:
        int n2 = 20;
        for (int i = 1; i <= n2; i++) { // => 1+(n+1)+n=n+2
            System.out.println("azad");// => n    total = 1+(n+1)+n+n=3n+2 which is equal to O(3n+2) or O(n)
        }
        for (int i = n2; i >= 1; i--) {
            System.out.println("azad");// total = 1+(n+1)+n+n=3n+2 which is equal to O(3n+2) or O(n)
        }
        for (int i = 1; i <= n2; i = i + 2) {// => n/2
            System.out.println("azad");// => n/2   total equal to O(n/2) or O(n)
        }
        for (int i = n2; i >= 1; i = i - 2) {
            System.out.println("azad");// => n/2   total equal to O(n/2) or O(n)
        }
        for (int i = n2; i >= 1; i = i + 5) {
            System.out.println("azad");// => n/5   total equal to O(n/5) or O(n)
        }
        for (int i = n2; i >= 1; i = i - 5) {
            System.out.println("azad");// => n/5   total equal to O(n/5) or O(n)
            // Note: if i=i+k and k is a constant then time complexity equals to O(n). executes n/k times
        }

        // Ex3
        for (int i = 1; i <= 100; i++) { // => 100 times
            System.out.println("azad");// => 100 times  total = 200 times  time complexity=O(200) or O(1)for constant
        }
        int n3 = 20;
        for (int i = n3; i <= n3; i++) { // 1 times
            System.out.println("azad");// 1 times  total=2 times  Tc=O(2) or O(1)
        }
        swap(10, 20); // no loop so Tc=O(1)

        //Ex4
        int n4=32;
        for (int i=1;i<n4;i=i*2){ // k=log(n) or Tc=O(log(n))
            System.out.println("azad");
        }
        for (int i=n4;i>1;i=i/2){ // k=log(n) or Tc=O(log(n))
            System.out.println("azad");
            // Note: i=i*k or i=i/k then Tc=O(log(n)) base k
        }

        // Ex5
        int n5=64;
        for (int i=2;i<=n5;i=(int) Math.pow(i,2)){ // Tc=O(log(log(n)))
            System.out.println("azad");
        }
        for (int i=n5;i>=2;i=(int) Math.sqrt(i)){ // Tc=O(log(log(n)))
            System.out.println("azad");
        }

    }

    public static void swap(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }
}
