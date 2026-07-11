package DSA.Recursion;

import java.util.HashSet;
import java.util.Set;

public class UniqueSubsequences {
    static void subSequences(String  st,int ind,String newString,Set<String>set){
        if(ind==st.length()){
           if(set.contains(newString)){
               return;
           }else {
               System.out.println(newString);
               set.add(newString);
               return;
           }
        }
        char character=st.charAt(ind);
        // call1 choose character
        subSequences(st,ind+1,newString+character,set);

        //call2 don't choose character
        subSequences(st,ind+1,newString,set);
    }
    public static void main(String args[]){
        String st="aaa";
        Set<String> set=new HashSet<>();
        subSequences(st,0,"",set);
    }
}
