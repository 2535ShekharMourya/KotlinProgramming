package DSA.LinkedListDS;

public class DoublyLinkedList {
    private Node2 head;
    private Node2 tail;
    private int size;
    public void insertFirst(int val){
        Node2 node=new Node2(val);
        node.next=head;
        node.prev=null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }
    public void Display(){
        Node2 node=head;
        while (node!=null){
            System.out.print(node.value +" ->");
            node=node.next;
        }
        System.out.println("End");
    }
    public void displayReverse(){
        Node2  node=head;
        Node2 last=null;
        while (node!=null){
            last=node;
            node=node.next;
        }
        while (last!=null){
            System.out.print(last.value+" ->");
            last=last.prev;
        }
        System.out.println("End");
    }
    private class Node2 {
        private int value;
        private Node2 next;
        private Node2 prev;

        public Node2(int value) {
            this.value = value;
        }

        public Node2(int value, Node2 next,Node2 prev) {
            this.value = value;
            this.next = next;
            this.prev=prev;
        }

    }
}
