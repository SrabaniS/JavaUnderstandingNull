package love.programming;

public class UnderstandingNull {
    static Object myObject = new Object();//here object is the class


    static Object myOtherObject;
    static int myInt;
    static String myString;
    public static void main(String[] args) {

        Object localObject = new Object();
        Object myAnotherObject;

        String name = "Java";
        String myAnotherName = null;
        System.out.println("my int = "+myInt);
        System.out.println("my object = "+myObject);
        System.out.println("my other object="+myOtherObject);
        //System.out.println("my other object="+myAnotherObject);
        System.out.println("my local object ="+localObject);

        System.out.println("my name is ="+name);
        System.out.println("my another name is ="+myAnotherName);

        myString = "Java";
        System.out.println("my string = "+myString);
        System.out.println("my string =" +myString.toLowerCase());
        System.out.println("my string = "+myString);

        //intialise myString = "Java"; and run again

        //myInt = null;

        myObject = myInt;
        System.out.println("my object = "+myObject);
        myObject = null;
        System.out.println("my object = "+myObject);
    }

}
