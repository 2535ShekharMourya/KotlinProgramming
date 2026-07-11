package DSA.Array;

public class SubArrayProblems {
    private static int maxSum(int[] arr1, int n) { //Brute Force Approach Tc= O(n^3)
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // subarray = arr[i.....j]
                int sum = 0;

                //add all the elements of subarray:
                for (int k = i; k <= j; k++) {
                    sum += arr1[k];
                }
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }
    private static int maxSum2(int[] arr1, int n) { // Better solution. Tc= O(n^2)
        int maxi = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr1[j];
                maxi = Math.max(maxi, sum);
            }
        }
        return maxi;
    }
    private static int maxSum3(int []arr,int n){ // optimal solution: Tc= O(n)
        int maxi = Integer.MIN_VALUE;
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=arr[i];
            maxi=Math.max(sum,maxi);
            if (sum<0){
                sum=0;
            }
        }
        return maxi;
    }

    public static void main(String[] args) {
        for (int i=0;i<2;i++){
            if (i==0){
                int arr1[] = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
                int n1 = arr1.length;
                int ans1 = maxSum(arr1, n1);
                System.out.println("my maximum subArraySum is : " + ans1);
                int ans2 = maxSum2(arr1, n1);
                System.out.println("my maximum subArraySum is : " + ans2);
                int ans3 = maxSum3(arr1, n1);
                System.out.println("my maximum subArraySum is : " + ans3);
            } else if (i==1) {
                int arr1[] = {-2,-3, 4, -1, -2, 1, 5, -3};
                int n1 = arr1.length;
                int ans1 = maxSum(arr1, n1);
                System.out.println("my maximum subArraySum is : " + ans1);
                int ans2 = maxSum2(arr1, n1);
                System.out.println("my maximum subArraySum is : " + ans2);
                int ans3 = maxSum3(arr1, n1);
                System.out.println("my maximum subArraySum is : " + ans3);

            }

        }
    }

}
