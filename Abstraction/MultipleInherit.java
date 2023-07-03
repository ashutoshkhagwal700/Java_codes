// A Java program to give example for multiple inheritance.

package Abstraction;

interface Printable1{
    void print1();
}

interface Showable1{
    void show1();
}

class A2 implements Printable1, Showable1{
    public void print1(){
        System.out.println("Welcome");
    }
    public void show1(){
        System.out.println("Java");
    }
}
public class MultipleInherit {
    public static void main(String[] args) {
        A2 obj = new A2();
        obj.print1();
        obj.show1();
    }
}
