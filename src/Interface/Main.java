package Interface;

public class Main {
    /*
    An Interface is defined as an abstract type used to specify the behavior of a class.
    contains fields(public, static, and final by default) and abstract methods(public by default).
    used to achieve abstraction.
    facilitates multiple inheritance.
    used to achieve loose coupling.
    A class that implements an interface must implement all the methods declared in the interface.

    So, the question arises why use interfaces when we have abstract classes?
        The reason is, abstract classes may contain non-final variables,
        whereas variables in the interface are final, public, and static.

    From Java 8, interfaces can also contain concrete methods(static/default).
    From Java 9, interfaces can also contain private methods
                    - which brings code re-usability within the interface.
     */
}
