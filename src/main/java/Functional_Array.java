package com.Bridgelabz;
import java.util.Scanner;
public class Functional_Array {
    public static void main(String[] args) {
        Scanner arr=new Scanner(System.in);
        System.out.println("Enter the integer to be in array:");
        int len=arr.nextInt();
        System.out.println("Enter a value for array:");
        int[] ar = new int[len];
        for(int i=0;i<len;i++)
        {
            ar[i]=arr.nextInt();
        }
        int count=0;
        for(int i=0;i<len-2;i++) {
            for (int j = i + 1; j < len - 1; j++)
            {
                for(int k=j+1;k<len;k++)
                {
                    if(ar[i] + ar[j] + ar[k] == 0)
                    {
                        System.out.println("("+ar[i]+" , "+ar[j]+" , "+ar[k]+")");
                        count++;
                    }
                }
            }

        }
        System.out.println("the distinct triplets equal to zero");
        System.out.println("There are "+count+" distinct triplets");
    }
}