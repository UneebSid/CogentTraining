package Day9;

import java.util.Scanner;

public class Question2 {
    public static void main(String[] args)
    {

        Scanner keyboard = new Scanner(System.in);

        String name;
        String areaOfInterest;
        int rollNo;

        System.out.println("Please enter your name: ");
        name = keyboard.nextLine();

        System.out.println("Please enter yor roll number: ");
        rollNo = keyboard.nextInt();
        keyboard.nextLine();


        System.out.println("Enter your area of interest: ");
        areaOfInterest = keyboard.nextLine();

        System.out.println("Hey, my name is "+ name + " and my roll number is "+ rollNo + ".My field of interest are " + areaOfInterest);

        System.out.println("***********************************");
    }
}
