package package_main;

import java.awt.*;
import java.sql.SQLOutput;
import java.util.Arrays;
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

        //String message = " Hello World" + "!!  ";
        //System.out.println(message);
        //System.out.println(message.endsWith("!!"));
        //System.out.println(message.startsWith("!!"));
        //System.out.println(message.length());
        //System.out.println(message.indexOf("E"));
        //System.out.println(message.indexOf("sky"));

        //System.out.println(message.replace( "!",  "*"));
        //System.out.println(message.trim());
        //System.out.println(message); //in Java strings are immutable, we can not mutate them, they are immutable

        //Escape Sequences
        //String message = "C:\nWindows\\..."; //new line
        //String message = "C:\tWindows\\..."; //tab between  c drive and windows
        //System.out.println(message);

        //Array old way
        //int[] numbers = new int[5];
        // numbers[0] = 1;
        // numbers[1] = 2;
        // numbers[10] = 3; wont work,its a exception
        // Arrays.toString(numbers);//typing arrays automatically imports arrays //use the dot operator to access method class
        // System.out.println(Arrays.toString(numbers)); //when java returns a string

        //Array new way
        // int[] numbers  = { 2, 3, 5, 1, 4 };
        // Arrays.sort(numbers); //sort numbers from 1 to 5
        // System.out.println(Arrays.toString(numbers)); //print 1,2,3,4,5

        // Multi-dimensional arrays
        // int[][] numbers = new int[2][3]; //two dimensional array two by three metrics 2 rows 3 columns
        //  numbers[0][0] =1; //first row and first column
        // System.out.println(Arrays.toString(numbers)); // you get a weird array because your dealing a multidimensional array
        // System.out.println(Arrays.deepToString(numbers)); //deep to string used to print multi dimmensional arrays. Prints [[1,0,0], [0,0,0]] You can add third [] to make it three dimesional

        // Multidimensional arrays  three dimensions
        // int[][] numbers = {{1,2,3}, {4,5,6}};
        // System.out.println(Arrays.deepToString(numbers)); //three dimesional array

        //arithmetic expression
        //double result = (double)10 / (double)3; //there needs to be a double infront of the variable because it double, int wont work
        //System.out.println(result);

        //int x =1;
        // x++; and // ++x; pro fix and pre fix you get the same result which is 2, if you use this of right side operator you get different results
        // System.out.println(x); result 2

        //int x = 1;
        //int  y = ++x ; // increment operator first the value of x is going to be copied to y. Y will be one and then x will be incremented by 1.

        //System.out.println(x); //result x will be two
        //System.out.println(y); //result y will be one

        //int x = 1;
        //int y = ++x; // // first if we add this as  "++" as a prefix. First x is gonna be incremented by one and then it will be copied to y.
        //System.out.println(x);  //So we get x=2
        //System.out.println(y); //so we get y=2

        // augmented or compound arithmatic operator
        //int x = 1;
        //x += 2; //same as x = x + 2; but shorter
        // System.out.println(x);

        //int x = 1;
        //x -= 2; //same as x = x - 2; but shorter. Reduces the value by 2
        // System.out.println(x);

        //int x = 1;
        //x *= 2; //same as x = x - 2; but shorter. multiplies the value by 2
        // System.out.println(x);

        //int x = 1;
        //x /= 2; //same as x = x - 2; but shorter. divides the value by 2
        // System.out.println(x);

        //int x = 10 + 3 * 2;
        //System.out.println(x);

        // order of operations
        // (), *,/, +,-

        //casting
        // implicit casting or// automatic casting
        //short x = 1;
        //int y = x + 2;
       // System.out.println(y);

        //implicit casting: happens when your not gonna lose data
        //byte > short > int > long > float  > double
        //double x = 1.1;
        // int y = x + 2 // you will have a compilation error because y is a int znd x is double: skip this doesnt work
        //double y = x + 2; // In this Java will automatically cast 2 to 2.0  then 2.0 will be added to 1.1
        //System.out.println(y);
        //double x = 2.1;
        //int y = (int)x + 2; //this is explicit casting, you convert x to a integer. explicit casting can happen only between compatible types
        //System.out.println(y);

        //this is how you convert to a string to integer
        //String x = "1";
        //int y = Integer.parseInt(x) + 2; //converts x from a string to a integer
        //System.out.println(y);  //this is important because if your building a user interface then you will get a value as a sting so it will covert it to its numeric expression

        //converting doubles
        //String x = "1.1";
        //double y = Double.parseDouble(x) + 2;
        //System.out.println(y);

        //The math class: math.round
        // int result = Math.round(1.1F); //rounds the float
        // System.out.println(result); //you get 1.1

        //math class: ciel method
        //int result = (int) Math.ceil(1.1F); // Ceil of float 1.1 returns the smallest integer  that is greaten than or equal to that number. You will get a compile error because the ciel of 1.1 returns a double if int not added in-front of math method. But your storing the result in a integer. You need to store it in a integer.
        //System.out.println(result); //returns 2

        //math class:floor method
        // int result = (int) Math.floor(1.1F); // Ceil of float 1.1 returns the smallest integer  that is less than or equal to that number. You will get a compiling error if you dnt add a int before math method because the floor of 1.1 returns a double. But your storing the result in a integer. You need to store it in a integer.
        // System.out.println(result); //returns 1

        //math class: random max
        //int result = Math.max(1,3); //returns the max between 2 numbers
        //System.out.println(result);

        //math class: min class
        //int result = Math.min(1,3); //returns the min between 2 numbers
        //System.out.println(result);

        //math class: random
        //double result = Math.random(); //You will get compilation error if you use int because random method returns a double. So use double for it return a random decimal.
        //System.out.println(result); // result is a floating point number between 0 and 1

        //math class: getting a random number between 0 and 100
        double result = Math.random() * 100;
        System.out.println(result); //

















    }

}
