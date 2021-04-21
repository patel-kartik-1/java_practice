package com.company;
import java.util.Scanner;
public class ex1marks {

    public static void main(String[] args) {
        int total;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st subject marks");
        int a=sc.nextInt();
        System.out.println("Enter 2st subject marks");
        int b=sc.nextInt();
        System.out.println("Enter 3st subject marks");
        int c=sc.nextInt();
        System.out.println("Enter 5st subject marks");
        int d=sc.nextInt();
        System.out.println("Enter 5st subject marks");
        int e=sc.nextInt();
        total=a+b+c+d+e;

        float per =total/5;
        System.out.println(per);

    }

}
