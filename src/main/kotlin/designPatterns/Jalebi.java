package designPatterns;

public class Jalebi {
    private static Jalebi jalebi=new Jalebi();
// Eager way of creating singleton object
    public static Jalebi getJalebi(){
        return jalebi;
    }
}
