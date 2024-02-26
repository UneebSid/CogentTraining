package Day9;

import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        double length;
        double breadth;

        System.out.println("Enter length of a rectangle: ");
        length = keyboard.nextDouble();
        System.out.println();
        System.out.println("Enter breadth of a triangle: ");
        breadth = keyboard.nextDouble();

        int area = (int) (breadth*length)/2;
        System.out.println("Area of the triangle is: " + area);
    }
}
