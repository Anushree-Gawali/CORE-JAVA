import java.util.Scanner;
class q12{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter basic salary : ");
		double bs = sc.nextDouble();
		if(bs < 10000)
		{
			double hra = (bs*10/100);
			double da = (bs*90/100);
			System.out.println(hra);
			double gs = bs + hra + da;
			System.out.println("Gross salary: " +gs);
			
		}
		else
		{
			double hra = 2000;
			double da = (bs*98/100);
			double gs = bs + hra + da;
			System.out.println("Gross salary: "+gs);
			
		}
			
	}


}
