package mathClass;

import java.sql.SQLOutput;

public class ExerciseMathRandom {
    public static void main(String[] args){

        /*
        Create a program which is generating a random number between 45 - 98
        and print it out.

        (int) (Math.random() * (endPoint - startPoint + 1) + startPoint)
        */

        //System.out.println((int) (Math.random() * 54 + 45));

        /*
        Create a program which is generating two random numbers between 67 - 85
        and print it out the number1 and number2 and max and min.
        */

        int random1 = (int)(Math.random() * 19 +67);
        int random2 = (int)(Math.random() * 19 +67);
        System.out.println("First number is: "+random1+
                "\nSecond number is: "+random2+
                "\nMax of both numbers: "+Math.max(random1, random2)+
                "\nMin of both numbers: "+Math.min(random1,random2));
    }


}
