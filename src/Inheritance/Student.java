package Inheritance;

public class Student extends User {
    int student_id;

    void doSomething() {
        student_id = 45;
        user_name = "Mohit";
        user_id = 90;
        age = 56;
      //  super();
        // can't access the private members of the parent class
        // outside the parent class
       // token="HI";
        System.out.println(user_id+" "+token);
      //  Exception
    }
}
