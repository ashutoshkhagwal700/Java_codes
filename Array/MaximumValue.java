// Program to find out the maximum value in a array.

package Array;
import java.util.Scanner;
class Maximum {
    Scanner sc = new Scanner(System.in);

    void maxVal() {
        int max = 0;
        int arr[] = new int[10];
        System.out.println("Enter 10 elements of an array: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements are: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" " + arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("\nMaximum value is " + max);
    }
}
public class MaximumValue {
    public static void main(String[] args) {
     Maximum obj = new Maximum();
     obj.maxVal();
    }
}
