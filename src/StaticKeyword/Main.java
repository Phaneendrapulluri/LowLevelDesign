package StaticKeyword;

public class Main {
    /*
    static can be used with - blocks, variables, methods, classes.
    static keyword allocates memory to the associated block/variable/method/class without object creation.
    static blocks/variables/methods are associated with the class, not with the objects.
    static blocks/variables/methods will be created in method Area
        & associated with class not with object. (1 static block for 1 class).
    static creates shared memory, that is for all the objects of the class.
    We cannot call non-static methods inside a static block/method. Vice versa is possible.

    static block -
        will be executed very first in the class, even before main method.
    When an object is created first non-static block & then the constructor will be executed.
    we can have any number of static blocks in a class.

    static variable -

    static method -
    Can be overloaded, but not overridden:
        Static methods can be overloaded, which means that you can define multiple methods
        with the same name but different parameters. However, they cannot be overridden,
        as they are associated with the class rather than with a particular instance of the class.

    static class -
    A class can be made static only if it is a nested class.
    We cannot declare a top-level class with a static modifier
    but can declare nested classes as static.

     */
}
