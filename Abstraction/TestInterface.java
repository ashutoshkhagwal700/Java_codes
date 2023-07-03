//Example of an interface.

package Abstraction;

interface bank{
    int getRateOfInterest();
}

class HDFC implements bank{
    public int getRateOfInterest(){
        return (9);
    }
}

class PNB implements bank{
    public int getRateOfInterest(){
        return 8;
    }
}
public class TestInterface {
    public static void main(String[] args) {
      HDFC h = new HDFC();
      PNB p = new PNB();
        System.out.println("HDFC rate of interest is " + h.getRateOfInterest());
        System.out.println("PNB rate of interest is " + p.getRateOfInterest());
    }
}
