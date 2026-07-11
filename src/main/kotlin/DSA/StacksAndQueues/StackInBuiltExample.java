package DSA.StacksAndQueues;

import java.util.*;

public class StackInBuiltExample {
    public static void main(String args[]) {
        Stack<Integer> stack = new Stack<>();
        stack.push(20);
        stack.push(21);
        stack.push(22);
        stack.push(23);
        stack.push(24);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println();
        //   System.out.println(stack.pop());


        Queue<Integer> queue = new LinkedList<>();


        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(6);
        queue.add(7);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
    }
}
