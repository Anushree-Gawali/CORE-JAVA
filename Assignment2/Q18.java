//18. Program to check whether number is prime or not.

import java.util.*;
import java.lang.Math;

public class Q18 {
    public static void main(final String[] args) {
        final Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        final int num = sc.nextInt();
        int flag = 0;
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            System.out.println(num + " is not Prime.");

        } else
            System.out.println(num + " is Prime.");
        sc.close();
    }
}
