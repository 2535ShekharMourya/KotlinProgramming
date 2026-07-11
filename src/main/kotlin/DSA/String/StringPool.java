package DSA.String;
// date:28-02-2024
public class StringPool {
    public static void main(String[] args) {
        String name="naveen";
        name=name+" Reddy";
        System.out.println(name);
        String name2="naveen";
        System.out.println(name2);
        // here name and name2 point same string which is "naveen"
        // in string pool there is only one "naveen" string created and name and name2 both point to same string
    }
}
