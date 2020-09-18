import java.util.Scanner;
class q14{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a year: ");
		int x = sc.nextInt();
		if(x%4==0 && x%100!=30 || x%400==0)
		System.out.println("It is a leap year");
		else
		System.out.println("It is not leap year");
	}
}