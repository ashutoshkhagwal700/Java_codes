// Example of Abstract class that has an abstract method.

package Abstraction;
abstract class Bike{
    abstract void run();
}
class Harley extends Bike{
    void run(){
        System.out.println("Harley is running");
    }
    public static void main(String[] args) {
        Bike obj = new Harley();
        obj.run();
    }
}
