package Day9;


import java.util.Scanner;

class Average
{

    public void calculateAverage(int a, int b, int c)
    {
        System.out.println("Average: " + (a+b+c)/3);
    }

}

public class Question3 {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        Average average = new Average();

        int x,y,z;

        System.out.println("Type in first integer: ");
        x = keyboard.nextInt();
        System.out.println("Type in second integer: ");
        y = keyboard.nextInt();
        System.out.println("Type in third integer: ");
        z = keyboard.nextInt();

        average.calculateAverage(x,y,z);

    }
}
