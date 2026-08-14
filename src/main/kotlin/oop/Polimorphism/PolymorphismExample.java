package oop.Polimorphism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PolymorphismExample {
    public static void main(String[] args) {

        List<Shape> shapes = Arrays.asList(
                new Circle(),
                new Rectangle(),
                new Square()

        );
        processAreas(shapes);


        List<Notification> notifications = Arrays.asList(
                new EmailNotification(),
                new SMSNotification(),
                new PushNotification()
        );
       // processNotification(notifications);
    }
    public static void processAreas(List<Shape> shapes){
        for (Shape shape : shapes){
            shape.calculateArea();
        }
    }
    public static void processNotification(List<Notification>notifications){
        for (Notification notification : notifications){
            notification.send("OTP: 1234");
        }

    }
}

/*interface Shape {
     void calculateArea();
}*/
abstract class Shape {
    public abstract void calculateArea();
}
class Circle extends Shape{
    @Override
    public void calculateArea() {
        int r=2;
        int area = (int) (7.14 * Math.pow(r,2));
        System.out.println("Circle Area: "+area);

    }
}
class Square extends Shape{
    @Override
    public void calculateArea() {
      int side =2;
      int area = side * side;
        System.out.println("Square Area: "+area);
    }
}
class Rectangle extends Shape{

    @Override
    public void calculateArea() {
        int height =2;
        int length =4;
        int area = height * length;
        System.out.println("Rectangle Area: "+area);
    }
}

/*abstract class Notification{
public abstract void send(String message);
   public void send(String message, String recipient) {
        System.out.println("send message: " + message + " to " + recipient);
    }
}*/

/*interface Notification {
public void send(String message);
}*/
class Notification{
    public void send(String message){
        System.out.println("send message: "+ message);
    }
    void send(String message, String recipient) {
        System.out.println("send message: " + message + " to " + recipient);
    }
}
class EmailNotification extends Notification{
    @Override
    public void send(String message) {
//        super.send(message);
        System.out.println("Email Notification: " + message);
    }
}
class  SMSNotification extends Notification{
    @Override
    public void send(String message) {
//        super.send(message);
        System.out.println("SMS Notification: "+ message);
    }
}
class PushNotification extends Notification{
    @Override
    public void send(String message) {
//        super.send(message);
        System.out.println("push Notification: "+ message);
    }
}
/*Polymorphism
        Exercise 1 — Notification System ⭐⭐⭐⭐⭐      Create:
        Notification
        ├── EmailNotification
        ├── SmsNotification
        └── PushNotification
        Each implements: send(message: String)
        Then create: val notifications: List<Notification>
and send all notifications without checking their concrete type.
        Important interview point:
        The interviewer wants to see whether you understand runtime polymorphism.
        Follow-ups: Why don't you need if (notification is EmailNotification)?
        What happens at runtime?
        Ans: At compile time, Java sees: Notification → send(), So the call is valid.
        At runtime, JVM sees: Actual object → SMSNotification, Therefore it executes: SMSNotification.send()
        Difference between compile-time and runtime polymorphism?
Shape Area ⭐⭐⭐⭐    Create:
        Shape
        ├── Circle
        ├── Rectangle
        └── Triangle
        Each implements: calculateArea()
        Then: fun printAreas(shapes: List<Shape>)
        should calculate every shape's area without knowing its concrete class.
        Follow-ups: Can this be implemented with an interface?
        Abstract class vs interface?
        Ans: can create 100+ interface now a single class can implement each but this is not for Abstract Class(too much hirarchy)
        Why is polymorphism useful here?*/
