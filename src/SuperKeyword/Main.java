package SuperKeyword;

public class Main {
    /*
    super keyword is used to refer to the parent class when working with the subclass.

    Super is used to call a super class constructor.
    When a subclass is created, its constructor must call the constructor of its parent class.
    When calling a superclass constructor, the super() statement must be the first statement
    in the constructor of the subclass.
    One more important thing is that ‘super’ can call both parametric
    , and non-parametric constructors depending on the situation.
    Even if the super keyword is not used, then also parent constructor is called by default.

    super is used to call a superclass method, if it is overridden in the subclass.
    super is not required to call a superclass method, if it is not overridden in the subclass.

    super is used to access a superclass field.
    This is useful when the subclass wants to reference the parent class’s version of a field.

    super cannot be used in a static context.
     */
    /*
    Advantages -
    Enables reuse of code
    Supports polymorphism
    Provides access to parent class behaviour
    Allows for customization of behaviour
    Facilitates abstraction and encapsulation
     */
    /*
    Constructor chaining can happen -
    1.within the class - using this keyword to switch b/w overloaded constructors
        this keyword should be the first line of the constructor.
    2.among the parent & child classes.
     */
    public static void main(String[] args) {
        Child c = new Child();

    }
}
