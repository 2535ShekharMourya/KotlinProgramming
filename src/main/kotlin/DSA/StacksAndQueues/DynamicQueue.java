package DSA.StacksAndQueues;

public class DynamicQueue extends CircularCustomQueue{
    public DynamicQueue(){
        super(); // it will call super class constructor CustomStack()
    }
    public DynamicQueue(int size){
        super(size); // it will call super class constructor CustomStack(size)
    }

    @Override
    public boolean insertItem(int item) throws Exception {
        if (this.isFull()   ){
            // double the array size
            int []temp=new int[data.length*2];
            // copy all previous items in new data
            for (int i=0;i<data.length;i++){
                temp[i]=data[(front+i)%data.length];
            }
            front=0;
            end=data.length;
            data=temp;
        }
        return super.insertItem(item);
    }
}
