package FinalKeyword;

import java.io.DataInputStream;

public class finallyExample {
    /*
    The only times finally won't be called are:
    If you invoke System.exit()
    If you invoke Runtime.getRuntime().halt(exitStatus)
    If the JVM crashes first
    If the JVM reaches an infinite loop (or some other non-interrupter,
        non-terminating statement) in the try or catch block
    If the OS forcibly terminates the JVM process; e.g., kill -9 <pid> on UNIX
    If the host system dies; e.g., power failure, hardware error, OS panic, etc.
    If the finally block is going to be executed by a daemon thread and all
        other non-daemon threads exit before finally is called
     */
    public static void main(String[] args) {
        int x=10;
        DataInputStream cin = new DataInputStream(System.in);

        try {
            int i = Integer.parseInt(cin.readLine());
        }catch (Exception e) {
            System.out.println("Hello!!");
            System.exit(0); // Program terminates before executing the finally block
        } finally {
            System.out.println("Won't be executed");
            System.out.println("No error");
        }
    }
}
