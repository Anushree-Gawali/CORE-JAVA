import java.util.Scanner;
class q8{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("enter principle value : ");
		double p = sc.nextDouble();				System.out.println("enter rate of an interest : ");
		double r = sc.nextDouble();						System.out.println("enter period of time : ");
		double t = sc.nextDouble();
		double si = ((p*r*t)/100);
		System.out.println("Simple Interest = " +si);

	}
}
