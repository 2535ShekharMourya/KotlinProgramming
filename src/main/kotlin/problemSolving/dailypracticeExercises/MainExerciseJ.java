package problemSolving.dailypracticeExercises;

public class MainExerciseJ {

    public static void main(String[] args) {
        int []arr= new int[]{2,5,1,7,10};
        solveTheProblem(arr,14);


    }

    public static void solveTheProblem(int []arr, int k){
        int maxLen =0 ;
        for (int i=0;i<arr.length;i++){
            int sum =0;
            for (int j=i;j<arr.length;j++){
                sum = sum + arr[j];
                if (sum <=k){
                    maxLen = Math.max(maxLen,j-i+1);
                }

            }
        }
        System.out.println(maxLen);
    }
}
