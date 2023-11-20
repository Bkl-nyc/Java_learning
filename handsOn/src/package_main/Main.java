package package_main;

import java.awt.*;
import java.sql.SQLOutput;
// import java.util.Date; //importing java.util package and Date class

public class Main { //main class

    //inside this class we have our main method
    public static void main(String[] args) { //main method

        //public means it is available from other parts of our program
        //main method always static
        // void mean not gonna return a value
        // byte age = 30;
        //  long viewCount = 3_123_143_124L; //Wont save as a int so save it as a long but even as long too big so have to add L
        // dnt use lowercase l because looks like a 1 so use capital L
        // float price = 10.99F; //You need to add f or F at the end or it automatically saves as a Double
        // boolean isEligible = true;
        // System.out.println("Hello World");

        //reference types for storing complex variables like emails
        //byte age = 30;
        // Date now = new Date(); //reference type ex //now is an instance of the date class // Date is an instance of the date class //an object is an instance of a class
        // now.getTime()  //objects like now can now access members/methods of class using the dot operator.
        // System.out.println(now); //sout tab make it automatically system.out.println.

        //int x;
        // int y;
        //Point point1 = new Point(x=1, y=1);
        //Point point2 = point1;
        //Point1.x = 2;
        //System.out.println(point2);

        String message = " Hello World" + "!!  ";
        System.out.println(message);
        //System.out.println(message.endsWith("!!"));
        //System.out.println(message.startsWith("!!"));
        //System.out.println(message.length());
        //System.out.println(message.indexOf("E"));
        //System.out.println(message.indexOf("sky"));
        System.out.println(message.replace( "!",  "*"));



    }
}
