package DSA.StacksAndQueues;

public class CircularCustomQueue {
    protected int data[];
    int end=0;
    protected   int front=0;
    private  int size=0;
    private static final int DEFAULT_SIZE=10;
    public CircularCustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CircularCustomQueue(int size){
        this.data=new int[size];
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==data.length;
    }
    public boolean insertItem(int item)throws Exception{
        if (isFull()){
            throw new Exception("queue is full please Remove elements");
        }
        data[end++]=item;
        end=end%data.length;
        size++;
        return true;
    }
    public int RemoveItem()throws Exception{
        if (isEmpty()){
            throw new Exception("queue is empty please insert elements");
        }
        int removed=data[front++];
        front=front%data.length;
        size--;
        return removed;
    }

    public int frontItem()throws Exception{
        if (isEmpty()) {
            throw new Exception("queue is empty");
        }
        return data[front];
    }

    public void display() {
        if (isEmpty()){
            System.out.println("Empty");
            return;
        }
        int i=front;
        do{
            System.out.println(data[i]+"->");
            i++;
            i%=data.length;
        }while (i!=end);
        System.out.println("END");
    }
}
