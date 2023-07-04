package Basics;

// Program to find simple interest.

import java.util.Scanner;
public class SimpleInterest {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p,r,t;
        float si;
        System.out.println("Enter principle amount= ");
        p = sc.nextInt();
        System.out.println("Enter rate of interest= ");
        r = sc.nextInt();
        System.out.println("Enter time= ");
        t = sc.nextInt();
        si = (p * r * t)/100;
        System.out.println("Simple interest is= " + si);
    }
}