package exercises;

import java.util.Scanner;


public class Mpg {
    public static void main(String[] args) {
        int milesDriven;
        int gasConsumed;
        int mpg;
        Scanner in;

        in =  new Scanner(System.in);
        System.out.println("How many miles were driven? ");
        milesDriven = in.nextInt();

        System.out.println("How much gas was consumed? ");
        gasConsumed = in.nextInt();

        mpg = milesDriven / gasConsumed;
        System.out.println("The Miles per Gallon is " + mpg);
    }
}
