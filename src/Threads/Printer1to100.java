package Threads;

public class Printer1to100 implements Runnable{
    private int num;
    Printer1to100(int num){
        this.num=num;
    }
    @Override
    public void run() {
        System.out.println(num+" "+Thread.currentThread().getName());
    }
}
