import java.util.Scanner;
import java.lang.Math;
class MathOperation
{
	private int a;
	private int b;
	
	static int add(int a,int b)
	{
		return a+b;
	}
	static void printAdd(int A){
		System.out.println("addition : "+A); 
	}
	
	static int subtract(int a,int b)
	{
		return a-b;
	}
	static void printSub(int S){
		System.out.println("subtraction : "+S); 
	}
	
	static int multiply(int a,int b)
	{
		return a*b;
	}
	static void printMul(int M){
		System.out.println("multiplication : "+M); 
	}
	static int power(int a,int b)
	{
		return (int) Math.pow (a, b);
	}
	static void printPower(int P){
		System.out.println("power : "+P); 
	}
}

class Demo
{
	public static void main(String args[])
	{
		    Scanner sc = new Scanner(System.in);
		    System.out.println("first number : ");	
		    int n1 = sc.nextInt();
			System.out.println("second number : ");	
		    int n2 = sc.nextInt();
			
			int Addition= MathOperation.add(n1,n2);
			MathOperation.printAdd(Addition);
			int Subtraction= MathOperation.subtract(n1,n2);
			MathOperation.printSub(Subtraction);
			int multiplication=MathOperation.multiply(n1,n2);
			MathOperation.printMul(multiplication);
			int Power=MathOperation.power(n1,n2);
			MathOperation.printPower(Power);
	}
	
}