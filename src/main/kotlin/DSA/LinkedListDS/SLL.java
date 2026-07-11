package DSA.LinkedListDS;

public class SLL {
    public static void main(String args[]){
     /*   SinglLinkedList list=new SinglLinkedList();
        list.insertAtFirst(3);
        list.insertAtFirst(4);
        list.insertAtFirst(5);
        list.insertAtFirst(6);
        list.insertAtFirst(7);
        list.insertAtLast(99);
        list.insertAtPosi(200,3);
        list.display();
       // System.out.println(list.deleteposi(2));
        System.out.println(list.findValue(6));
      //  System.out.println(list.deletLast());
       // System.out.println( list.deletFirst());
        list.display();

      */




        DoublyLinkedList list=new DoublyLinkedList();
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.insertFirst(6);
        list.Display();
        list.displayReverse();
    }
}
