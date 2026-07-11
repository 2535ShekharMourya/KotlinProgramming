package DSA.ProblemSolvingTechniques;

import java.util.*;

public class SlidingWindow {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int arr[]={4,1,3,5,1,2,3,2,1,1,5};
        int n=arr.length;
        findMax(arr,n,3);
        findMax2(arr,n,3);
        findMax3(arr,n,3);
    }
    // method 1
    public static void findMax(int []arr,int n,int k){
        int min=0;
        int arr2[]=new int[n-k+1];
        for (int i=0;i<=n-k;i++){
            min=arr[i];
            for (int j=1;j<k;j++){
                if (arr[i+j]<min){
                    min=arr[i+j];
                    arr2[i]=min;
                }
            }
            System.out.print(min+" ");

        }
        //arr2[arr2.length-1]=max;
       // System.out.println(Arrays.toString(arr2));

    }
    public static ArrayList<Integer> findMax2(int arr[], int n, int k){
        // creating the max heap for always top element is max
        PriorityQueue<Integer>queue=new PriorityQueue<>(Collections.reverseOrder());
        ArrayList<Integer>res=new ArrayList<>();
        int i=0;
        for (;i<k;i++)
            queue.add(arr[i]);
        // adding max element into our list
        res.add(queue.peek());
        queue.remove(arr[0]);
        for (;i<n;i++){
            // adding the new element in the window
            queue.add(arr[i]);
            res.add(queue.peek());
            queue.remove(arr[i-k+1]);
        }
return res;
    }
    static int[] findMax3(int[] arr, int n,int k)
    {
        int[] ans = new int[n - k + 1];
        Deque<Integer> maxInWindow = new ArrayDeque<>();

        // Initialize maxInWindow with the first k elements
        for (int i = 0; i < k; i++) {
            while (!maxInWindow.isEmpty()
                    && arr[i]
                    >= arr[maxInWindow.peekLast()]) {
                maxInWindow.removeLast();
            }
            maxInWindow.addLast(i);
        }

        // The maximum element in the first window
        ans[0] = arr[maxInWindow.peekFirst()];

        // Process the remaining elements
        for (int i = k; i < n; i++) {
            // Remove elements that are out of the current
            // window
            while (!maxInWindow.isEmpty()
                    && maxInWindow.peekFirst() <= i - k) {
                maxInWindow.removeFirst();
            }

            // Remove elements that are not needed in the
            // current window
            while (!maxInWindow.isEmpty()
                    && arr[i]
                    >= arr[maxInWindow.peekLast()]) {
                maxInWindow.removeLast();
            }

            maxInWindow.addLast(i);
            ans[i - k + 1] = arr[maxInWindow.peekFirst()];
        }

        return ans;
    }
}
