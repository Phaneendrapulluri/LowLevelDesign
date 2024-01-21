package Threads;

public class MainPrinter {
    public static void main(String[] args) {

        Printer p1=new Printer();
        Runnable p2=new Printer();
        Thread t1=new Thread(p1);
        t1.start();

        System.out.println("Current Thread:"+Thread.currentThread().getName());

    }
}

/*
Process -> Program in execution
Thread -> Smallest CPU executable unit
Every process has a PCB(Process Control Block)
CPU Scheduler -> decides what thread should run at this moment
Concurrent System -> one core, one thread at a time, many partial executed threads
Parallel System -> >1 core, >1 thread at a time, many partial executed threads
 */