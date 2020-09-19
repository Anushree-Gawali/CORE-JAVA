// print all prime numbers between two given numbers. [ break continue ]

import java.util.*;
import java.lang.Math;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers:  ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        for (int i = num1; i <= num2; i++) {
            if (i <= 1)
                continue;
            int flag = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.print(" " + i);
        }
        sc.close();
    }
}
