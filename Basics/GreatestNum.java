//Program to find Greatest number

package Basics;

import java.util.Scanner;

public class GreatestNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter thre numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b && a>c) {
            System.out.println(a + " is greatest");
        }
        else if(b>c) {
            System.out.println(b + " is greatest");
        }
        else {
            System.out.println(c + " is greatest");
        }
    }
}