// Example of Interface inheritance.

package Abstraction;

interface Printable2{
    void print2();
}

interface Showable2 extends Printable2{
    void show2();
}

class Inherit1 implements Showable2{
    public void print2(){
        System.out.println("Print Hello");
    }
    public void show2(){
        System.out.println("Print Java");
    }
}

class TestInterface1 {

    public static void main(String[] args) {
      Inherit1 obj = new Inherit1();
      obj.print2();
      obj.show2();
    }
}
