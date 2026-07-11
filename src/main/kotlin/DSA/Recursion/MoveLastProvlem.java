package DSA.Recursion;

public class MoveLastProvlem {
    public static void main(String[] args) {
        String st="fdgdczxsdcxxd";
        // DSA.String New="";
        MoveX(st,0,0,"");
    }
    public static void   MoveX(String st,int ind,int cont,String New){
        if(ind==st.length()){
            for (int i=0;i<cont;i++){
                New=New+"x";
            }
            System.out.println(New);
            return;

        }
        char c=st.charAt(ind);
        if ('x'==c){
            cont++;
            MoveX(st,ind+1,cont,New);
        }else {
            New=New+c;
            MoveX(st,ind+1,cont,New);
        }



    }
}
