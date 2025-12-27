package problemSolving.arrayString.slidingwindow;

public class MainSlidingWindowProblems {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,1,2,7,10};
       // constantWindow(arr,4);
        longestSubArrWithSum(arr,14);

    }
    public static void constantWindow(int[]arr,int k){
        // {-1,2,3,4,5,6,-1}: k=4 op: 18, Maxi sum of K window
        int sum=0;
        for (int i=0;i<k;i++){
            sum= sum + arr[i];
        }
        int maxSum = sum;
        int minSum= Integer.MAX_VALUE;
        int left =0,right = k;
        while (right<arr.length-1){
            sum = sum - arr[left];
            left++;
            sum = sum + arr[right];
            right++;
            maxSum = Math.max(maxSum,sum);
            minSum = Math.min(minSum,sum);
        }

        System.out.println(maxSum);
    }

    public static void longestSubArrWithSum(int []arr, int k){
        // {2,5,1,7,10}: op: 3 : longest suArray with sum<=k
        // Brute solution
        int maxLen=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            int sum=0;
            for (int j=i;j<arr.length;j++){
                sum = sum + arr[j];
                if (sum<=k){
                    maxLen = Math.max(maxLen,j-i+1);
                }else if(sum>k){
                    break;
                }
            }

        }
        System.out.println(maxLen);
    }
}
