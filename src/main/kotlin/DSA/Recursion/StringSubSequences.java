package DSA.Recursion;

public class StringSubSequences {
    static void subSequences(String  st,int ind,String newString){
        if(ind==st.length()){
            System.out.println(newString);
            return;
        }
        char character=st.charAt(ind);
        // call1 choose character
        subSequences(st,ind+1,newString+character);

        //call2 don't choose character
        subSequences(st,ind+1,newString);
    }
    public static void main(String args[]){
        String st="abc";
        subSequences(st,0,"");
    }
}
