// Example of Heirarchical Inheritance

package Inheritance;

class Animal2 {
    void sound(){
        System.out.println("sounds of animals");
    }
}
class Dog1 extends Animal2{
    void bark1(){
        System.out.println("Dog is barking");
    }
}

class Cat1 extends Animal2{
    void meow(){
        System.out.println("cat is sounding like meow");
    }
}

class Main1{
    public static void main(String[] args) {
        Cat1 obj = new Cat1();
        obj.sound();
        obj.meow();
    }
}
