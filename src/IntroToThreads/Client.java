package IntroToThreads;

public class Client {
    public static void main(String[] args) {
        Runnable x = new NPrinter();
        for(int i=1;i<=100;i++){
            Thread t = new Thread(x);
            t.start();
        }
        System.out.println("Hi " + Thread.currentThread().getName());
    }
}
