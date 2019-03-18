package exercises;

import java.util.Scanner;


public class RectangleArea {
    public static void main(String[] args) {
        int length;
        int width;
        int area;
        Scanner in;

        in = new Scanner(System.in);
        System.out.println("What is the length? ");
        length = in.nextInt();

        System.out.println("What is the width? ");
        width = in.nextInt();

        area = length * width;
        System.out.println("The area of the rectangle is " + area);
    }

}
