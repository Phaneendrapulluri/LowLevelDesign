package LambdasANDStreams;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {

    }
}
/*
Functional interface -> SAM(Single Abstract Method) interface
will have only 1 abstract method(which need to be implemented by the class)
but can also have many default/static methods too (which need not be implemented by the class)
Lambda -> is a way to create an object of a class that implements a Functional inf/SAM
()-> {}
Examples of Functional Interface - Runnable, Callable, Comparator
Disadvantages -> Not Reusable directly but can be done indirectly by creating a static method for it

*/