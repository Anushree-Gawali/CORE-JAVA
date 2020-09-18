import java.util.Scanner;
class q7{
	public static void main(String args[]){
		Scanner sc = new Scanner("50 50 50 98 98");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		int p = ((a+b+c+d+e) / 5);
		System.out.println("percentage marks = " +p+ " %");
	}
}
			