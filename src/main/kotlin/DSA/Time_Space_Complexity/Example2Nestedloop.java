package DSA.Time_Space_Complexity;

public class Example2Nestedloop {
    public static void main(String[] args) {
        // Independent Nested loop: inside loop don't depend on outside loop
        // when inner loop and outer loop independent then find inner loop time complexity and outer loop
        // time complexity and multiply both
        //Ex1
        int n=100; // but  n is a variable not fix this is for demo
        for (int i=1;i<=n;i++){ // =>      i=1,          i=2,       i=3 .....    i=n
            for (int j=1;j<=n;j++){ // =>  j=n times,    j=n times  j=n times ....j=n times
                System.out.println("azad"); // Tc=O(n^2)
            }
        }
        // Ex2
        for (int i=1;i<=n;i++){ // =>      i=1,          i=2,       i=3 .....    i=n
            for (int j=n;j>=1;j=j/2){ // =>  j=log(n) times,    j=log(n) times  j=log(n) times ....j=log(n) times
                System.out.println("azad"); // Tc=O(nlog(n))
            }
        }
        // Ex3
        for (int i=n;i<=2;i=(int) Math.pow(i,1/3)){ // 1+k*10>n => k>(n-1)/10 => k=n ---->1
            for (int j=1;j<=Math.pow(2,n);j=j*2){   // 2^k>2^n => log2^k >log2^n => k>n => k=n --->2
                for (int k=1;i<=n;k=k+10){          // (n)^1/3^k >2 => log both side simplify => k=log(log(n))
                    System.out.println("azad");  // total Tc=O(n^2*log(log(n)))
                }

            }
        }
        // Ex4
        for (int i=n;i>=1;i=i-n/2){                           // => 2 times or constant time
            for (int j=1;j<=Math.pow(n,2);j=j*10){            // => 10^k>n^2 => log both side and simplify => k=log(n)
                for (int k=(int) Math.pow(n,10);k>=1;k=k/2){  // => (n^10)/2^k <1 => k=log(n)
                    System.out.println("azad");               // total Tc=O(1*log(n)*log(n))
                }
            }
        }
// Dependent Nested loop
        // Ex1
        for (int i=1;i<=n;i++){ // =>      i=1,          i=2,       i=3 .....    i=n
            for (int j=1;j<i;j++){ // =>  j=1 times,    j=2 times  j=3 times ....j=n times
                System.out.println("azad"); //  1+2+3+4......n= n(n+1)/2 = (n^2+n)/2= O(n^2)
            }
        }
    }
}
