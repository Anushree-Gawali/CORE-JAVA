import java.util.Scanner;
class q11{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("enter Number: ");
		int x = sc.nextInt();
		System.out.println("enter Another Number: ");
		int y = sc.nextInt();
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("The given numbers after swapping are  = " +x+ " and " +y);

	}
}
