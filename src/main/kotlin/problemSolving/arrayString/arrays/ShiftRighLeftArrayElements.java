package problemSolving.arrayString.arrays;

public class ShiftRighLeftArrayElements {
    public static void main(String[] args) {

    }

    public static void leftShiftByOne(int[] arr) {
        // ip: [1, 2, 3, 4, 5] and op: [2, 3, 4, 5, 1]
        int first = arr[0];

        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        arr[arr.length - 1] = first;
    }

    public static void rightShiftByOne(int[] arr) {
        //iP:  [1, 2, 3, 4, 5] op: [5, 1, 2, 3, 4]
        int last = arr[arr.length - 1];

        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }

    // 3️⃣ Left Shift by K — Medium
    public static void leftShiftByK(int[] arr, int k) {
        // iP: [1, 2, 3, 4, 5], k = 2, op: [3, 4, 5, 1, 2]

        k = k % arr.length;

        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
        reverse(arr, 0, arr.length - 1);
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // 4️⃣ Right Shift by K — Medium
    public static void rightShiftByK(int[] arr, int k) {
        //ip: [1, 2, 3, 4, 5], k = 2 , op: [4, 5, 1, 2, 3]

        k = k % arr.length;

        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);
    }

    // 5️⃣ Shift Zeroes to End (Order Preserved) — Medium, Shift all 0s to the end without using extra array.
    public static void shiftZeroes(int[] arr) {
        // [0, 1, 0, 3, 12] op: [1, 3, 12, 0, 0]

        int index = 0;

        for (int num : arr) {
            if (num != 0) {
                arr[index++] = num;
            }
        }

        while (index < arr.length) {
            arr[index++] = 0;
        }
    }

   // 6️⃣ Shift Negative Numbers to Left — Medium
   public static void shiftNegatives(int[] arr) {
        // ip: [1, -2, 3, -4, 5], op: [-2, -4, 1, 3, 5]
       int left = 0, right = arr.length - 1;

       while (left <= right) {
           if (arr[left] < 0) {
               left++;
           } else if (arr[right] >= 0) {
               right--;
           } else {
               int temp = arr[left];
               arr[left] = arr[right];
               arr[right] = temp;
               left++;
               right--;
           }
       }
   }

  // 7️⃣ Circular Left Shift — Medium
  public static void circularLeftShift(int[] arr) {
        // ip:  [10, 20, 30, 40], op: [20, 30, 40, 10]

      int first = arr[0];

      for (int i = 0; i < arr.length - 1; i++) {
          arr[i] = arr[i + 1];
      }

      arr[arr.length - 1] = first;
  }

 // 8️⃣ Cyclic Right Rotation Using Juggling Algorithm — Advanced, Rotate array right by k using GCD method.
 public static void rightRotate(int[] arr, int k) {
     int n = arr.length;
     k = k % n;
     int gcd = gcd(n, k);

     for (int i = 0; i < gcd; i++) {
         int temp = arr[n - 1 - i];
         int j = n - 1 - i;

         while (true) {
             int d = j - k;
             if (d < 0) d += n;
             if (d == n - 1 - i) break;

             arr[j] = arr[d];
             j = d;
         }
         arr[j] = temp;
     }
 }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

}
