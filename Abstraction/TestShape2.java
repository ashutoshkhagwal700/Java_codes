// Example of Abstract class that has an abstract method.

package Abstraction;

abstract class Shape{
    abstract void draw();
}

class Circle extends Shape{
    void draw(){
        System.out.println("Circle is draw");
    }
}

class Square extends Shape{
    void draw(){
        System.out.println("Square is draw");
    }
}

public class TestShape2 {
    public static void main(String[] args) {
      Shape c = new Circle();
      Shape s = new Square();
      c.draw();
      s.draw();
    }
}


