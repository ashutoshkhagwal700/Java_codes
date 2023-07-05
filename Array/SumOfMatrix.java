//Program to add two 2D matrix

package Array;
import java.util.Scanner;
public class SumOfMatrix {
    int i, j;

    //    Method to add two matrix:
    void add(int a[][], int b[][]) {
        int[][] c = new int[3][3];
        System.out.println("Addition of matrix:");
        for (i = 0; i < c.length; i++) {
            for (j = 0; j < c[i].length; j++) {
                c[i][j] = a[i][j] + b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] a = new int[3][3];
        int[][] b = new int[3][3];
        int[][] c = new int[3][3];
        Scanner sc = new Scanner(System.in);
         int i,j;
        System.out.println("Enter the first matrix: ");
        for(i = 0; i < a.length; i++){
            for (j = 0; j < a[i].length; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the second matrix: ");
        for(i = 0; i < b.length; i++){
            for (j = 0; j < b[i].length; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        SumOfMatrix obj = new SumOfMatrix();
        obj.add(a, b);
    }
}




