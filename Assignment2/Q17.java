
//17. Write a program to reverse a given number.
import java.util.Scanner;

public class Q17 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to reverse:   ");
        int num = sc.nextInt();
        int rev = 0;

        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }

        System.out.println("Rev: " + rev);

        sc.close();
    }
}
