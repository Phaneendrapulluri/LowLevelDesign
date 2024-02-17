package FinalKeyword;

public class Main {
    /*
    System.out.println("Hello!!");
    System is a final class in Java that provide various ip/op handling facilities.
    out is an object of PrintStream class that is present in System class.
    println() is a method of PrintSteam class.
     */
    public static void main(String[] args) {
        /*
        final -> is a modifier applicable for classes, methods & variables
        A variable declared as a final will become constant, and we can't reassign it.
        A method declared as a final, in child class we can't overwrite it.
        A class declared as final, can't be extended.

        finally -> is a block in exception handling which is always associated with try catch
        to maintain cleanup code.
        for e.g. db connection closure/file closure statements can be kept in finally block.
        finally block runs the important code even if exception occurs or not.
        finally block cleans up all the resources used in try block.

        finalize() -> is a method present in object class which is always invoked by
        garbage collector just before destroying an object to perform cleanup activities.
         */
        Main obj = new Main();
        // printing the hashcode
        System.out.println("Hashcode is: " + obj.hashCode());
        obj = null;
        // calling the garbage collector using gc()
        System.gc();
       // System.out.println("End of the garbage collection");
    }
    // defining the finalize method
    //protected void finalize()
    {
        System.out.println("Called the finalize() method");
    }
}
