public class q29 {
    public static void main(String[] args) {
        int arr[][] = new int[3][5];

        System.out.println("Total number of 1D arrays: " + arr.length);
        for (int a[] : arr)
            System.out.println("Total number of item are: " + a.length);
    }
}
