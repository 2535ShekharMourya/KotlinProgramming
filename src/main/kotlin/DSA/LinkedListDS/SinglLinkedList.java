package DSA.LinkedListDS;
public class SinglLinkedList {
    private Node1 head;
    private Node1 tail;
    private int size;
    public SinglLinkedList(){
        this.size=0;
    }
    public int deletLast(){
       if (size<=1){
           deletFirst();
       }
       Node1 secondLast=getReference(size-2);
       int val=tail.value;
       tail=secondLast;
       tail.next=null;
        size--;
       return val;
    }
    public Node1 findValue(int value){
        Node1 node=head;
        while (node!=null){
            if (node.value==value){
                return node;
            }
            node=node.next;
        }
        return null;
    }
public int deleteposi(int index){
        if (index==0){
            return deletFirst();
        }
        if (index==size-1){
            return deletLast();
        }
        Node1 prev=getReference(index-1);
        int val=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return val;
}
    public Node1 getReference(int index){
        Node1 node=head;
        for (int i=0;i<index;i++){
            node=node.next;
        }
        return node;

    }
     public int deletFirst(){
        int val=head.value;
        head=head.next;
        if (head==null){
            tail=null;
        }
        size--;
        return val;
     }
    public void insertAtLast(int val){
        if(tail==head){
            insertAtFirst(val);
            return;
        }
        Node1 node=new Node1(val);
        tail.next=node;
        tail=node;
        size++;
    }
    public void insertAtPosi(int val,int index){
      if(index==0){
          insertAtFirst(val);
      }
      if (index==size){
          insertAtLast(val);
      }
      Node1 temp=head;
      for(int i=1;i<index;i++){
     temp=temp.next;
      }
      Node1 node=new Node1(val , temp.next);
      temp.next=node;
      size++;
    }

    public void insertAtFirst(int val){
        Node1 node=new Node1(val);
        node.next=head;
        head=node;
        if (tail==null){
            tail=head;
        }
        size++;
    }
public void display(){
        Node1 temp=head;
        while (temp!=null){
            System.out.print(temp.value +" -> ");
            temp=temp.next;
        }
    System.out.println("END");
}

 private class Node1 {
     private int value;
     private Node1 next;

     public Node1(int value) {
         this.value = value;
     }

     public Node1(int value, Node1 next) {
         this.value = value;
         this.next = next;
     }

 }
}

