package DSA.BinarySearch;

public class OrderAgnosticBS {
    public static void main(String ag[]){
      //  int arr[]={90,75,18,12,6,4,3,1};
        int arr[]={1,2,3,4,5,6,7,8};
        int target=6;
        int ans=OABs(arr,target);
        System.out.println(ans);
    }
    public static int OABs(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        // check given array is increasing order or decreasing order
        boolean isAcending=arr[start]<arr[end];
        boolean isDecending=arr[start]>arr[end];
        boolean SameNoinArray=arr[start]==arr[end];
        if (arr[start] < arr[end]){
            isAcending=true;
        }else {
            isAcending=false;
        }
        while (start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]==target){
                return mid;
            }
            if (isAcending){
                if (arr[mid]<target){
                    start=mid+1;

                }else {
                    end=mid-1;
                }
            }else {
                if (arr[mid]<target){
                    end =mid-1;
                }else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
