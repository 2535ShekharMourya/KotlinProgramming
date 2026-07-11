package MultithreadingAsyncProgramming;

public class MyThread1 implements Runnable{
    @Override
    public void run() {
        // task for threads
        for (int i = 0; i < 10; i++) {
            System.out.println("the value of i is : " + i);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        }
        class MyThread2 extends Thread{
            public void run(){
                for (int i=10;i>0;i--){
                    System.out.println("the value of i is :"+i);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }

        public static void main (String[]args){
            MyThread1 t = new MyThread1();
            Thread thr = new Thread(t);

       //     MyThread2 t1=new MyThread2();
            thr.start();
           // t1.start();

        }
    }
