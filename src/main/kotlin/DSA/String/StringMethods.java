package DSA.String;

public class StringMethods {
    public static void main(String[]args){
        String st="  azad shekhar mourya  ";
        String s1=st.substring(7);
        System.out.println(s1);
        String s2=st.substring(7,14);
        System.out.println(s2);
        String s3=st.replace("a","o");
        System.out.println(s3);
        String s4=st.trim();
        System.out.println(s4);
    }
}
