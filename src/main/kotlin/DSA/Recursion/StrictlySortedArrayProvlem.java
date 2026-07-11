package DSA.Recursion;

public class StrictlySortedArrayProvlem {
    public static void main(String args[]){
        int ar[]={1,2,3,4,5,6,7};
        System.out.println(Sorted(ar,0));
    }

    private static boolean Sorted(int[] ar, int i) {
        if(i==ar.length-1){
            return true;
        }
        if(ar[i]<ar[i+1]&&ar[i]!=ar[i+1]){
            return   Sorted(ar,i+1);

        }else {
            return false;
        }

    }
}
