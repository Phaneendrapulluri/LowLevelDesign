package IntroToThreads;


public class NPrinter implements Runnable{

    @Override
    public void run() {
     //   for(int i=1;i<=100;i++){
            System.out.println(" "+ Thread.currentThread().getName());
            System.out.println();
      //  }
    }
}
