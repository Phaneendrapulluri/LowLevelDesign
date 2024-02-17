package LambdasANDStreams;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Stream1 {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(5);
        al.add(6);
        al.add(7);
        al.add(8);
        al.add(9);
        al.add(10);

        Stream<Integer> s1 = al.stream();
       // s1.filter((x)->{return x%2==0});
    }
}

/*
Stream is a flow of data
Stream is a interface in java
Stream can be attached to the Collections like List,Map etc.

Stream API provide Lazy Evaluation -- it will not do the work until you want to return the data
delays the work of doing until which can't be avoided comes in

Streams have 2 types of methods -> Intermediate & Terminal.
Terminal -> methods which have to be done right now & can't be delayed
EX: forEach, collect(returns list not a stream)
Intermediate -> methods which can be delayed & lazily evaluated
EX: filter
Intermediate methods will be evaluated only when a terminal method is triggered
Intermediate methods will also try to be optimized before evaluating
Once a terminal Operation is performed on a stream then that stream is closed & no longer available

 */
