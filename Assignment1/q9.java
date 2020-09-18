import java.util.Scanner;
class q9{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("enter a days : ");
		int x = sc.nextInt();
		int y = x / 365;
		x = x % 365;
		int m = x / 7;
		x = x % 7;
		int d = x;
		System.out.println("The given day required " +y+ " years " +m+ " months " +d+ " days ");

	}
}
