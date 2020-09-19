public class Q23 {

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 6, 7, 8, 9 };

        int i = 0;
        int j = arr.length - 1;

        while (j > i) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int x : arr) {
            System.out.print(" " + x);
        }
    }

}
