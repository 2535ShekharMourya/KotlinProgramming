package designPatterns;
// 1. Constructor must be private
// 2. object create with the help of method
// 3. create field or property to store object is private
public class Samosa {
    private static  Samosa samosa;
    private Samosa(){

    }
    /*
    // Lazy way of creating single object. useful when thread sefty not a concern
    public static Samosa getSamosa(){
        // create object of this class
        if (samosa==null){
          samosa= new Samosa();
        }
        return samosa;
    }*/

    /*// at a time only one thread can access this method
    public static synchronized Samosa getSamosa(){// this is method synchronization
        // create object of this class
        if (samosa==null){
            samosa= new Samosa();
        }
        return samosa;
    }*/

    public static Samosa getSamosa(){
        // create object of this class
        if (samosa==null){
            synchronized (Samosa.class) { // at a time only this block access by single thread
                if (samosa==null) // this is block Synchronization
                samosa = new Samosa();
            }
        }
        return samosa;
    }


}
