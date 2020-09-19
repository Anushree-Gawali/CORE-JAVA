// 25. Write the program to find the 
// sum of even elements and sum of odd elements present in the array of integer type.

public class Q25 {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int sumOdd = 0;
        int sumEven = 0;
        for (int x : arr) {
            if (x % 2 == 0)
                sumEven += x;
            else
                sumOdd += x;
        }
        System.out.println("Sum Even:  " + sumEven + " Sum odd: " + sumOdd);
    }
}
