package designPatterns;

public class DesignPatterns {
    public static void main(String[] args) {
      /*  Phone p=new Phone("android",2,"intel i5",5.5,4000);
        System.out.println(p);*/

        Phone p=new PhoneBuilder()  // this is builder object
                .setBattery(4000)
                .setOs("android")
                .setRam(9)
                .getPhone();
        System.out.println(p);

        // Lazy way
      /*  Samosa samosa1=Samosa.getSamosa();
        System.out.println(samosa1.hashCode());
        Samosa samosa2=Samosa.getSamosa();
        System.out.println(samosa2.hashCode());
        // Eager way
        System.out.println(Jalebi.getJalebi().hashCode());
        System.out.println(Jalebi.getJalebi().hashCode());

*/

    }
}
