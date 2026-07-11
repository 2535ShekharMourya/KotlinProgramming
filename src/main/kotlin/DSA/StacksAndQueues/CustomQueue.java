package DSA.StacksAndQueues;

public class CustomQueue {
    private int data[];
    int end=0;
    private static final int DEFAULT_SIZE=10;
    public CustomQueue(){
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data=new int[size];
    }

    public boolean isEmpty(){
        return end==0;
    }

    public boolean isFull(){
        return end==data.length;
    }

    public boolean insertItem(int item)throws Exception{
        if (isFull()){
            throw new Exception("queue is full please Remove elements");
        }
         data[end++]=item;
        return true;
    }

    public int RemoveItem()throws Exception{
        if (isEmpty()){
            throw new Exception("queue is empty please insert elements");
        }
        int removed=data[0];
        // shift the element to left
        for (int i=1;i<data.length;i++){
            data[i-1]=data[i];
        }
        end--;
        return removed;
    }

    public void display() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");
        }
    }

        public int frontItem()throws Exception{
            if (isEmpty()) {
        throw new Exception("queue is empty");
            }
            return data[0];
        }
    }

