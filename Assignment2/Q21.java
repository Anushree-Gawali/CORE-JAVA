
//21. Program to show sum and average of 10 element array. Accept array elements from user. 
import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 numbers: ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        for (int x : arr) {
            System.out.print(x + ", ");
        }
        sc.close();
    }
}
