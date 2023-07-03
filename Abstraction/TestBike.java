// Example of an abstract class that has abstract and non-abstract methods and constructor.

package Abstraction;

abstract class Bike1{
    abstract void run();
    void color(){
        System.out.println("Color is black");
    }
    Bike1(){
        System.out.println("This is constructor of abstract Bike1 class");
    }
}

class RoyalEnf extends Bike1{
    void run(){
        System.out.println("Bike is running");
    }
}

public class TestBike {
    public static void main(String[] args) {
      Bike1 obj = new RoyalEnf();
      obj.run();
      obj.color();
    }
}
