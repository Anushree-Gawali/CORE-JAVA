import java.util.Scanner;
class q26{
	public static void main(String args[]){
		int[][] a = new int[5][4];
		Scanner sc = new Scanner(System.in);
		int count=0;
		for(int i=0;i<5;i++){
			System.out.println("enter ele: ");
			for(int j=0;j<4;j++){
			if(count < 17){
			System.out.println();
			a[i][j] = sc.nextInt();
			count++;
			}
			}
		}
		int sum = 0;
		for(int i=0;i<5;i++){
			for(int j=0;j<4;j++){
			sum += a[i][j];
			}
		}
		System.out.println("Add = "+sum);	
		
	}
}