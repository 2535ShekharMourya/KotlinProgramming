package DSA.Recursion;

public class RemoveDuplicateInString {
    static boolean map[]=new boolean[26];
    static void removDuplicate(String st,int ind,String newString){
        if(ind==st.length()){
            System.out.println(newString);
            return;
        }
        char character=st.charAt(ind); //current character of given string
        if(map[character-'a']==true){
            removDuplicate(st,ind+1,newString);
        }else {
          newString+=st.charAt(ind);
          map[character-'a']=true;
          removDuplicate(st,ind+1,newString);
        }
    }
    public static void main(String args[]){
        String st="abbccda";
        String newString="";
        removDuplicate(st,0,newString);
    }
}
