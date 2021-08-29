package com.Bridgelabz;
import java.util.Scanner;
public class Functional_Array {
    public static void main(String[] args) {
        Scanner e =new Scanner(System.in);
        System.out.println("Enter the X1 , Y1 value to calculate the Origin");
        System.out.println("X1 =");
        int x2=e.nextInt();
        System.out.println("y1 =");
        int y2=e.nextInt();
        distance(x2,y2);
    }

    private static void distance(int x2, int y2) {
        int sqr1= (int) Math.pow(2, x2);
        int sqr2= (int) Math.pow(2, y2);
        double result = (Math.sqrt ( sqr1 + sqr2 ) );
        System.out.println("The Euclidean distance of the points is "+result);
    }
}