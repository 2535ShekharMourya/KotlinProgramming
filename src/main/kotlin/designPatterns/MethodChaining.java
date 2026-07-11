package designPatterns;

class Student1 {
    private String name;
    private String city;
    private int age;
    private int rollNo;
    private String gender;

    /*Student1(DSA.String name, DSA.String city, int age, int rollNo, DSA.String gender) {
        this.name = name;
        this.city = city;
        this.age = age;
        this.rollNo = rollNo;
        this.gender = gender;
    }*/


   /*public void setName(DSA.String name) {
        this.name = name;
    }

    public void setCity(DSA.String city) {
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public void setGender(DSA.String gender) {
        this.gender = gender;
    }*/

    public Student1 setName(String name) {
        this.name = name;
        return this;
    }

    public Student1 setCity(String city) {
        this.city = city;
        return this;
    }

    public Student1 setAge(int age) {
        this.age = age;
        return this;
    }

    public Student1 setRollNo(int rollNo) {
        this.rollNo = rollNo;
        return this;
    }

    public Student1 setGender(String gender) {
        this.gender = gender;
        return this;
    }
}

public class MethodChaining {
    public MethodChaining() {
    }

    public static void main(String ag[]) {
        Student1 s = new Student1();
        /*method 1 to initialize data members of class or set the data member values
        s.setAge(23);
        s.setCity("aonla");
        s.setName("azad");
        s.setGender("male");
        s.setRollNo(209);*/

        /*mathod 2 to set data member values
        Student1 s =new Student1("azad","aonla",23,209,"male");
        */

       /* get error because Return type of these methos are void
        s.setRollNo(209).setName("shekhar").setAge(20).setCity("aonla").setGender("male") */

        // finally this is a better way to calling any class methods and set the values of data member
        s.setRollNo(209).setName("shekhar").setCity("aonla").setGender("male").setAge(22);

        // another way to writhing this thing
        Student1 s1 = new Student1();
        s1
                .setAge(23)
                .setRollNo(209)
                .setName("shekar")
                .setGender("male")
                .setCity("Barielly");



    }
}









