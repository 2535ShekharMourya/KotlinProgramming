package DSA.String;

class Test<t> {
    t Container;

    public Test(t parameter) {
        this.Container = parameter;
    }

    public t getValue() {
        return this.Container;
    }
}
    class Example{
        Object container;
        public Example(Object parameter){
            this.container=parameter;
        }
        public Object getValue(){
            return this.container;
        }

    }

public class Revision3 {
    public static void main(String args[]) {
        Test<Integer>test=new Test<Integer>(3);
        Test<String>test1=new Test<>("s");




    }
}
