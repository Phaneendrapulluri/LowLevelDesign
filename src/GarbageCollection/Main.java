package GarbageCollection;

public class Main {
    /*
    Garbage Collection is the process of deleting the un-used/un-reference/anonymous objects
    inorder to free up the memory, so that this memory can be reused later point of time.

    Garbage Collection happens in Heap Area/MetaSpace but not in Stack Area.

    Garbage Collection helps to use memory efficiently & improves performance.

    Garbage collection is an automatic process in JAVA, we can also call garbage collector manually.

    When garbage collection is happening, it will pause the program execution & does its work which
    will result in world stop events in java.To avoid this, heap area is again divided into 2 -
    Young & Old Generation.
    Again Young Generation is divided into 3 - Eden space, S0(From space), S1(To space).
    Always 1 among(eden,s0,s1) will be empty.

    Minor Garbage collector first MARKS the un-used/un-reference/anonymous objects in
    eden space,S0 or S1(whichever is having objects) then SWEEPS them &
    then COMPACTS(rearranges the useful objects) & transfers them into S0/S1 space(whichever is empty).

    After 15 minor garbage collections, all the existing useful objects in
    Young generation will be moved to Old generation.

    Garbage collection in Old Generation is called Major Garbage Collection,
    which happens less frequently compared to minor garbage collection.

    In Metaspace also, major garbage collection happens.

    Garbage Collector can be called manually below -
    1. System.gc();
    2. Runtime.getRuntime().gc();
    1 again internally calls 2.

    public void finalize(){
        // gc calls this method while deleting objects
        finalize method is called once for every object deletion.
    }





     */
}
