import java.util.Scanner;
class q6{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a radius");
		double r = sc.nextInt();
		double a = (3.14 *r *r);
		double p = (2*3.14 *r);
		System.out.println("Area and Perimeter are " +a+ " and " +p);
	}
}
			