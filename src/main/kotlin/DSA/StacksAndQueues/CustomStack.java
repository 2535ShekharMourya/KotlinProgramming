package DSA.StacksAndQueues;

public class CustomStack {
    int ptr=-1;
    protected int []data;
    private static final int DEFAULT_SIZE=10;
    public CustomStack(){
        this(DEFAULT_SIZE);
    }
    public CustomStack(int size){
        this.data=new int[size];
    }
    // add element inside the stack
    public boolean push(int item){
        if(isFull()){
            System.out.println("Stack is full Please try to remove element first");
            return false;
        }
       // ptr++;+
        data[++ptr]=item;
        return true;
    }
    // remove element from the stack
    public int pop() throws Exception{
        if (isEmpty()){
            throw new Exception("You can't pop elements from the empty stack");
        }
        return data[ptr--];
    }
    // give us topmost item of stack
    public int peek()throws Exception{
        if (isEmpty()){
           throw new Exception("you can't get peek element from empty stack");
        }
        return data[ptr];
    }
    // check whether the stack is full or not
    public boolean isFull(){
        return ptr==data.length-1;
    }

    public boolean isEmpty(){
        return ptr==-1;
    }



}
