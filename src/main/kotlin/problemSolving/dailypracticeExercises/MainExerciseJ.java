package problemSolving.dailypracticeExercises;

public class MainExerciseJ {

    public static void main(String[] args) {
        int []arr= new int[]{6,2,3,4,7,2,1,7,1};
        solveTheProblem(arr,4);


    }

    public static void solveTheProblem(int []arr, int k){
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
