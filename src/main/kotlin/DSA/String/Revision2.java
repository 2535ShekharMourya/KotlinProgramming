package DSA.String;
import java.util.*;
public class Revision2 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the size of array");
        int n=s.nextInt();

        int arr[]=new int[n];
        System.out.println("insrt element");
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }

        int hash[]=new int[1000000000];
        for(int i=0;i<n;i++){
            hash[arr[i]]+=1;
        }
        System.out.println("enter no of queries");
        int p=s.nextInt();
        while (p>0){
            int numbr=s.nextInt();
            System.out.println(hash[numbr]);
            p--;
        }
    }

}
