package Threads;

public class Main1to100Printer {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            Printer1to100 p=new Printer1to100(i);
            Thread t=new Thread(p);
            t.start();
        }
    }
}
