package DSA.StacksAndQueues;

public class StackQueueMainClass {
    public static void main(String[] args) throws Exception {
      /* CustomStack stack=new CustomStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack.pop());
        for (int i=10;i<20;i++){
            stack.push(i);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }*/

      /*  DynamicCustomStack stack2=new DynamicCustomStack();
        stack2.push(1);
        stack2.push(2);
        stack2.push(3);
        stack2.push(4);
        stack2.push(5);
        stack2.push(6);
       for (int i=7;i<34;i++){
           stack2.push(i);
       }
       while (!stack2.isEmpty()){
           System.out.println(stack2.pop());
       }*/
/*
        CustomQueue queue=new CustomQueue(33);
        queue.insertItem(1);
        queue.insertItem(2);
        queue.insertItem(3);
        queue.insertItem(4);
        for (int i=5;i<20;i++){
            queue.insertItem(i);
        }
        queue.display();*/

        CircularCustomQueue queue=new CircularCustomQueue();
        queue.insertItem(1);
        queue.insertItem(2);
        queue.insertItem(3);
        queue.insertItem(4);
        System.out.println(queue.RemoveItem());
        queue.insertItem(123);

        queue.display();
    }
}
