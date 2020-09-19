//19. Calculate  series : 12+22+32+42+.........+n2

public class Q19 {
    public static void main(String[] args) {
        int n = 1;
        int a = 12;
        int dif = 10;
        int sum = a;
        for (int i = 1; i < n; i++) {
            a += dif;
            sum += a;
        }
        System.out.println("The sum is: " + sum);
    }
}
