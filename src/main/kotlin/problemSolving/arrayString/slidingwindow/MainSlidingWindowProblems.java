package problemSolving.arrayString.slidingwindow;

public class MainSlidingWindowProblems {
    public static void main(String[] args) {
        int[] arr = new int[]{2,5,1,10,10};
       // constantWindow(arr,4);
        longestSubArrWithSumBatter(arr,14);

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
    public static void longestSubArrWithSumBrute(int []arr, int k){
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
    public static void longestSubArrWithSumBatter(int []arr, int k){
        int left=0,right=0,sum=0,maxLen=0;
        while (right<arr.length){
            sum = sum + arr[right];
            while (sum>k){
                sum = sum - arr[left++]; // do not use ++left here:b/c it increment first then access 
               // left++;
            }
            if (sum<=k){
                maxLen = Math.max(maxLen,right - left + 1);
                right++;
            }
        }
        System.out.println(maxLen);

    }
    public static void maxPointsFromCards(int []arr, int k){
        // [6,2,3,4,7,2,1,7,1] ,k=4, op: 16
        int leftSum=0,rightSum=0;
        for(int i=0;i<k;i++){
            leftSum = leftSum + arr[i];
        }
        int maxSum =leftSum;
        int rightLength= arr.length-1;
        for (int i=k-1;i>=0;i--){
            leftSum = leftSum - arr[i];
            rightSum = rightSum + arr[rightLength];
            rightLength--;
            maxSum = Math.max(maxSum,(leftSum + rightSum));
        }
        System.out.println(maxSum);
    }

}
