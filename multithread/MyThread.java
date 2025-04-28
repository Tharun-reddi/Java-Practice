package multithread;

import java.util.Date;

public class MyThread extends Thread{
    public void run(){
        for(int i =0; i<=4; i++){
            System.out.println("Thread : " + Thread.currentThread() + i +"-" + new Date());
        }
    }

}
