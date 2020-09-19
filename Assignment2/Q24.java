//24. Write a program to search an element in the array.

public class Q24 {
    public static void main(String[] args) {
        int searchEle = Integer.parseInt(args[0]);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        int flag = 0;

        for (int x : arr) {
            if (searchEle == x) {
                System.out.println("Found: " + x);
                flag = 1;
                break;
            }
        }

        if (flag == 0)
            System.out.println("Not Found:  " + searchEle);
    }

}
