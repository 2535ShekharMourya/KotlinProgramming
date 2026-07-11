package DSA.Recursion;

public class PrintKeybordCombination {
    static String keypad[]={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    static void printCombo(String str,int ind,String combination){
        if(ind==str.length()){
            System.out.println(combination);
            return;
        }
        char current=str.charAt(ind);
        String mapping=keypad[current-'0'];
        for (int i=0;i<mapping.length();i++){
            printCombo(str,ind+1,combination+mapping.charAt(i));
        }
    }
    public static void main(String args[]){
        String str="23";
        printCombo(str,0,"");
    }


}
