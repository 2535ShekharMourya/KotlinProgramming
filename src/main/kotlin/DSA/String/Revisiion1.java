package DSA.String;
class student{
    int age=10;
    int rollno=209;
    String collegname="ipec";
    String name="shekhar";
    static String course="b.tech";
    void display(){
        System.out.println(age);
        System.out.println(rollno);
        System.out.println(name);
        System.out.println(course);
    }

    student(int a,String n){
        this.age=a;
        this.name=n;
    }
    student(String c,String cors){
        this.collegname=c;
        this.course=cors;
    }


}

public class Revisiion1 {
    public static void main(String args[]){

        student s1=new student(20,"shekhar");

       student s2=new student("iit","cse");
        System.out.println(s2.collegname +" "+s2.course);



    }
}
