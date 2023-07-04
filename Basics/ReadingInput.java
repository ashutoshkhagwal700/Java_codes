package Basics;

import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        byte b = sc.nextByte();
//        long l = sc.nextLong();
//        System.out.println(x * x);
//        String str = sc.nextLine();
//        System.out.println(str);
        char ch = sc.next().charAt(0);
        System.out.println(ch);
    }
}
