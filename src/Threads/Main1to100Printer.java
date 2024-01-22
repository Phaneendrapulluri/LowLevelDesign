package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main1to100Printer {
    public static void main(String[] args) {
        //Executor service will provide thread pools
     //   ExecutorService es1 = Executors.newFixedThreadPool(10);
        ExecutorService es2 = Executors.newCachedThreadPool();
        for(int i=1;i<=100;i++){
            Printer1to100 p=new Printer1to100(i);
//            Thread t=new Thread(p);
//            t.start();
            es2.execute(p);

        }
        es2.shutdown();



    }
}
