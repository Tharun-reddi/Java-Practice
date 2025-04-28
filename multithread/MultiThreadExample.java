package multithread;


public class MultiThreadExample {
    public static void main(String[] args) {
        MyThread mt = new MyThread();

        mt.setName("Thread-1");
        mt.start();
        // mt.run();
    }

}
