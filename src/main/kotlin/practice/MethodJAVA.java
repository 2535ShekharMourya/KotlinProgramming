package practice;

import java.util.*;

public class MethodJAVA {
   public static List<List<Integer>> findTriPlate(int[]arr,int target){
       Set<List<Integer>> uniqueResult = new HashSet<>();
      int n=arr.length;
      for (int i=0;i<n-3;i++){
         for (int j=i+1;j<n-2;j++){
            for (int k=j+1; k<n-1;k++){
               if (arr[i]+arr[j]+arr[k]==target){
                  List<Integer> list = new ArrayList<>();
                  list.add(arr[i]);
                  list.add(arr[j]);
                  list.add(arr[k]);
                  Collections.sort(list);
                  uniqueResult.add(list);
                 // result.add(Arrays.asList(arr[i],arr[j],arr[k]));
               }
            }
         }
      }
      System.out.printf(uniqueResult.toString());
       return new ArrayList<>(uniqueResult);
   }

   public static void findDuplicates(int []arr){
      Set<Integer>set= new HashSet<>();

   }

}
