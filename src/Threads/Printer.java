package Threads;

public class Printer implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World from "+Thread.currentThread().getName());
    }
}
