package Basics;

//Program to calculate area of rectangle.

class Rectangle {
    int length;
    int width;
    void insert(int l, int w){
        length = l;
        width = w;
    }
    void calculateArea(){
        System.out.println("area of rectangle= " + length*width);
    }
}
public class TestRectangle{
    public static void main(String[] args){
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        r1.insert(10, 20);
        r2.insert(20, 30);
        r1.calculateArea();
        r2.calculateArea();
    }
}