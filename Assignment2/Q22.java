// 22. Sort a ten element array in descending order.

public class Q22 {
    public static void main(String[] args) {
        int[] arr = { 5, 3, 1, 0, 4, 7, 6, 8, 9 };

        for (int i = 0; i < arr.length; i++) {

            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[index]) {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }

        for (int x : arr) {

            System.out.print(" " + x);
        }
    }
}
