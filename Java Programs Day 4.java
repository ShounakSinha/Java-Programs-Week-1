/**

import java.util.Scanner;

public class methods_area {
    public int area(int l, int b) {
        return l * b;
    }

    public int area(int s) {
        return s * s;
    }

    public double area(double r) {
        return 3.14 * r * r;
    }

    public int area(int a, int b, int c) {
        int s = (a + b + c) / 2;
        return (int) Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public static void main(String args[]) {
        methods_area obj = new methods_area();
        Scanner in = new Scanner(System.in);
        boolean running = true;
        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Calculate area of rectangle");
            System.out.println("2. Calculate area of square");
            System.out.println("3. Calculate area of circle");
            System.out.println("4. Calculate area of triangle");
            System.out.println("5. Exit");
            int choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter length and breadth:");
                    int length = in.nextInt();
                    int breadth = in.nextInt();
                    System.out.println("Area of rectangle is " + obj.area(length, breadth));
                    break;
                case 2:
                    System.out.println("Enter side length:");
                    int side = in.nextInt();
                    System.out.println("Area of square is " + obj.area(side));
                    break;
                case 3:
                    System.out.println("Enter radius:");
                    double radius = in.nextDouble();
                    System.out.println("Area of circle is " + obj.area(radius));
                    break;
                case 4:
                    System.out.println("Enter three sides:");
                    int side1 = in.nextInt();
                    int side2 = in.nextInt();
                    int side3 = in.nextInt();
                    System.out.println("Area of triangle is " + obj.area(side1, side2, side3));
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
        in.close();

    }

}

*/

//java program for varargs
/**

import java.io.*;

public class varargs {
    public int product(int... sumo) {   //varargs implemented here
        int prod  = 1;
        for (int i : sumo) {
            prod *= i;
        }
        return prod;
    }

    public static void main(String[] args) 
    {

        //varargs obj = new varargs();
        //System.out.println(obj.product(1, 2, 3, 4, 5));
        //System.out.println(obj.product(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter the numbers to multiply: ");
        String s = null;
        try {
            s = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String[] str = s.split(" ");
        int[] arr = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            arr[i] = Integer.parseInt(str[i]);
        }
        varargs obj = new varargs();
        System.out.println("Product of the numbers: " + obj.product(arr));
        
    }

}

*/

/**
import java.util.*;
public class recursion 
{
    public int addseries(int n)
    {
        if (n == 0) {
            return 0;
        } else {
            return n + addseries(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        recursion r = new recursion();
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("Sum of series is: " + r.addseries(n));
        recursion obj = new recursion();
        System.out.println(obj.addseries(5));
        r.close();
    }
    
}
*/

import java.util.Scanner;

public class FibonacciSeries {

    // Recursive function to find Fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();

        System.out.println("Fibonacci Series up to " + terms + " terms:");

        for (int i = 0; i < terms; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }
}







