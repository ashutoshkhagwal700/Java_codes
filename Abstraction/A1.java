//Example of an interface.

package Abstraction;

interface printable{
    void print();
}

public class A1 implements printable{
    public void print(){
        System.out.println("Hello");
    }
    public static void main(String[] args) {
      A1 obj = new A1();
      obj.print();
    }
}
