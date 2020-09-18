import java.util.Scanner;
class q10{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("enter temperature in F : ");
		double f = sc.nextDouble();
		double c = (5*(f-32)/9);
		System.out.println("The given temperature in Celsius = " +c);

	}
}
