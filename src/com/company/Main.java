package com.company;

import java.util.Scanner;

public class Main {
    private static int[] printArray(int[] a,int[] b,int len){
        int[] points =new int[2];
        for(int i =0; i<len;i++)
        {
            if(a[i]>b[i])
            {
                points[0]= points[0] +1;
            }else
            if(a[i]<b[i])
            {
                points[1]= points[1] +1;
            }
        }
        return points;


    }

    public static void main(String[] args) {
        int len =3;
        int[] a = new int[len];
        int[] b = new int[len];
        int[] points =new int[2];
        // int bob_point =0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Alice rate");
        for(int i =0; i<len;i++)
        {
            System.out.println("Enter a["+i+"]");
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Bob rate");
        for(int i =0; i<len;i++)
        {
            System.out.println("Enter b["+i+"]");
            b[i]=sc.nextInt();
        }
        points = printArray(a,b,len);
        System.out.println("Result points["+points[0]+","+points[1]+"]");

    }




}