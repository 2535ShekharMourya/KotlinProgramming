package DSA.Maths;

public class BasicMaths1 {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int noOfTest = sc.nextInt();
//        for (int i = 0; i < noOfTest; i++) {
//            int n = sc.nextInt();
//            System.out.println(reverseNumber(n,0));
//        }
        reverseNumber(345,0);

    }
    public static int reverseNumber(int n){
        int rev = 0;
        while(n>0){
            int rem = n%10;
            rev = rev*10+rem;
            n = n/10;
        }
        return rev;
    }
    public static int reverseNumber(int n, int res){
        if(n==0){
            return res;
        }
        int rem = n%10;
        res = res*10+rem;
        n = n/10;
        return   reverseNumber(n, res);

    }

}
