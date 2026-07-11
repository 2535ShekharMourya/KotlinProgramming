package DSA.Recursion;

public class SortedOrNot {
    static boolean Sorted(int arr[],int ind){
        if(ind==arr.length-1){
            return true;
        }
        return arr[ind]<arr[ind+1] && Sorted(arr, ind+1);
    }
    public static void main(String[] args){
        int arr[]={1,2,3,9,4,5,7};
        System.out.println(Sorted(arr,0));
    }


}
