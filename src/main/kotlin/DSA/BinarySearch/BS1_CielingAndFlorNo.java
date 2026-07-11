package DSA.BinarySearch;

public class BS1_CielingAndFlorNo {
    public static void main(String ag[]){
        int arr[]={2,3,5,9,14,16,18};
        int target=1;
        int ans=Ciellin(arr,target);// invalic i/p: input>18  ex. 19,20 ....
        System.out.println(ans);

        int ans2=Flor(arr,target); // invalid i/p: input<2  ex. 1,0,-1,-2,...
        System.out.println(ans2);
    }

    private static int Ciellin(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid= start+(end-start)/2;
            if (arr[mid]>target){
                end=mid-1;
            }else if (arr[mid]<target){
                start=mid+1;
            }else {
                return arr[mid];
            }
        }
        return arr[start];
    }

    private static int Flor(int[] arr, int target) {
        int start=0;
        int end=arr.length-1;

        while (start<=end){
            int mid= start+(end-start)/2;
            if (arr[mid]>target){
                end=mid-1;
            }else if (arr[mid]<target){
                start=mid+1;
            }else {
                return arr[mid];
            }
        }
        return arr[end];
    }
}
