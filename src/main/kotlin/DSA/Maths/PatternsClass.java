package DSA.Maths;

public class PatternsClass {
    public void pattern1(){
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                // System.out.print(i); 1,22,33..
                // System.out.print(j) 1,12,123...
                // System.out.print((char)(i+64)); A,BB,CC...
                //System.out.print((char)(j+64)); A,AB,ABC...
                //System.out.print((char)(i+96)); a,bb,ccc...
                //System.out.print((char)(j+64)); a,ab,abc...
                // System.out.print("*"); *,**,***....
                // System.out.print("#"); #,##,###...
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
        subpattern1();
        System.out.println();
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        System.out.println();
        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(j);

            }
            System.out.println();
        }
    }
    public static void subpattern1(){
        for(int i=1;i<=4;i++){
            for (int j=1;j<=2*i;j++){
                // System.out.print(j);
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public void pattern2(){
        for (int i = 1; i <=4; i++) {
            for (int j = 1; j <=4-i ; j++) {
                System.out.print(" ");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            for (int j=2;j<=i;j++){

                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void pattern3(){
        for(int i=1;i<=5;i++){
            for (int j=1;j<=5;j++){
                if(i+j==6 || i==j){
                    System.out.print(i);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void pattern4(){
        for (int i=1;i<=4;i++){
            for (int j=4-i;j>=1;j--){
                System.out.print(" ");

            }
            for (int j=1;j<=2*i-1;j++){
                if(j%2==0){
                    System.out.print("A");
                }else {
                    System.out.print("*");
                }

            }
            System.out.println();
        }
    }

}
