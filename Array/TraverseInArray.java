//Program of Traverse In 2D-Array.

package Array;
import java.util.Scanner;
public class TraverseInArray {
    int[][] arr = new int[3][3];
    int i, j;
    Scanner sc = new Scanner(System.in);

    //    Method to read the elements of array
    void read() {
        System.out.println("Enter elements of array(3*3): ");
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
    }

    //    Method to traverse the elements of array
    void write() {
        System.out.println("Elements are: ");
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TraverseInArray obj = new TraverseInArray();
        obj.read();
        obj.write();
    }
}
