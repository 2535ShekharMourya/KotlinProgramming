package DSA.StacksAndQueues;

public class DynamicCustomStack extends CustomStack{
    public DynamicCustomStack(){
        super(); // it will call super class constructor CustomStack()
    }
    public DynamicCustomStack(int size){
        super(size); // it will call super class constructor CustomStack(size)
    }
 /*Everything is same as CustomStack but problem is with push() method when stack id full
    then DynamicStack double the stack size*/
    @Override
    public boolean push(int item) {
        if (this.isFull()   ){
            // double the array size
            int []temp=new int[data.length*2];
            // copy all previous items in new data
            for (int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        // at this point we know that array is not full so Now insert items
        return super.push(item);
    }
}
