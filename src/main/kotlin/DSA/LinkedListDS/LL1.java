package DSA.LinkedListDS;

import java.util.*;

class Node {
    private int data;
    Node next;

    Node() {
        data = 0;
        next = null;
    }

    public Node(int d, Node N) {
        this.next = N;
        this.data = d;
    }

    void setData(int d) {
        this.data = d;
    }

    void setNext(Node N) {
        this.next = N;
    }

    Node getNext() {
        return next;
    }

    int getData() {
        return data;
    }
}

    class LinkList {
        private Node start;
        private int size;

        LinkList() {
            start = null;
            size = 0;
        }

        public boolean isEmpty() {
            if (start == null) {
                return true;
            } else {
                return false;
            }
        }

        public int getListSize() {
            return size;
        }

        public void insertAtStart(int val) {
            Node n = new Node();
            n.setData(val);
            n.setNext(start);
            start=n;
            size++;
        }

        void insertAtEnd(int val) {
            Node n, t;
            n = new Node();
            n.setData(val);
            t = start;
            if (t == null) {
                start = n;

            } else {
                while (t.getNext() != null) {
                    t = t.getNext();
                    t.setNext(n);
                }

            }
            size++;
        }

        void insertAtPosition(int val, int pos) {
            if (pos == 1) {
                insertAtStart(val);
            } else if (pos == size + 1) {
                insertAtEnd(val);
            } else if (pos > 1 && pos <= size) {
                Node n, t;
                n = new Node(val, null);
                t = start;
                for (int i = 1; i < pos - 1; i++) {
                    t = t.getNext();
                    n.setNext(t.getNext());
                    t.setNext(n);
                    size++;

                }

            } else {
                System.out.println("insertion not posible at this position  " + pos);
            }
        }

        void deletAtPosition(int pos) {
            if (start == null) {
                System.out.println("List is empty");
            } else if (pos < 1 || pos > size) {
                System.out.println("invalid position");
            } else if (pos == 1) {
                deletFirst();

            } else if (pos == size) {
                deletLast();
            } else {
                Node t, t1;
                t = start;
                for (int i = 1; i < pos - 1; i++) {
                    t = t.getNext();
                }
                t1 = t.getNext();
                t.setNext(t1.getNext());
                size--;
            }

        }

        void deletFirst() {
            if (start == null) {
                System.out.println("List is already empty");
            } else {
                start = start.getNext();
                size--;

            }

        }

        void deletLast() {
            if (start == null) {
                System.out.println("List is already empty");
            } else if (size == 1) {
                start = null;
                size--;
            } else {
                Node t;
                t = start;
                for (int i = 1; i < size - 1; i++) {
                    t = t.getNext();

                }
                t.setNext(null);
                size--;
            }


        }

        public void viewList() {
            Node t;
            if (isEmpty()) {
                System.out.println("list is empty");
            } else {
                t = start;
                for (int i = 1; i <= size; i++) {
                    System.out.print(" " + t.getData());
                    t = t.getNext();
                }
            }

        }

    }



public class LL1 {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        LinkList list = new LinkList();
       int choise=sc.nextInt();
       int position;
       switch (choise){
           case 1:
               System.out.println("insert value");
               int valu=sc.nextInt();
               list.insertAtStart(valu);
               break;
           case 2:
               System.out.println("insert value");
               int value=sc.nextInt();
               list.insertAtEnd(value);
               break;
           case 3:
               System.out.println("Enter position");
               position=sc.nextInt();
               System.out.println("enter value");
               int val=sc.nextInt();
               list.insertAtPosition(val,position);
               break;
           case 4:
               list.deletFirst();
               break;
           case 5:
               list.deletLast();
               break;
           case 6:
               System.out.println("Enter position");
               position=sc.nextInt();
               list.deletAtPosition(position);
               break;
           case 7:
               list.viewList();
               break;
           default:
               System.out.println("invalid choise");

       }
    }


}
