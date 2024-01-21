package WrapperClasses;

public class Main {
    public static void main(String[] args) {

        int x=65;
        Integer val1=x;                     //Auto Boxing
        Integer val2=Integer.valueOf(x);    //Boxing
        int y=val1.intValue();              //Unboxing
        int z=val1;                         //Auto Unboxing
        System.out.println(val1 + " " + val2);

        //Wrapper classes provides below methods to convert a integer stored as
        //string into an int/Integer
        String s="123";
        Integer a=Integer.valueOf(s);//returns Integer object
        int b=Integer.parseInt(s);   //returns primitive int type

        //While adding data to any collection(like arraylist/linkedlist etc..)
        //by default auto boxing happens cuz collection only support for
        // Wrapper classes objects storage
        //System.out.println("Hi There!");
    }
}
