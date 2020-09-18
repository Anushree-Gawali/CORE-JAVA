import java.util.Scanner;
class q15{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gender m or f");
		int g = sc.next().charAt(0);
		System.out.println("Enter an age: ");
		int x = sc.nextInt();
		//char g = character.parseChar(s);
		if((x>=20 && x<=30) && (g=='m' || g=='f'))
		System.out.println("Person is eligible for marriage");
		else
		System.out.println("Person is not eligible for marriage");
	}
}