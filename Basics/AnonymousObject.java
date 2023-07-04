//Factorial program through anonymous object

package Basics;

public class AnonymousObject {
    public  void fact(int n){
        int fact = 1;
        for(int i = 1; i <= n; i++){
            fact = fact * i;
        }
        System.out.println("factorial is " + fact);
    }
    public static void main(String[] args){

        //calling method through anonymous object

        new AnonymousObject().fact(5);

    }
}