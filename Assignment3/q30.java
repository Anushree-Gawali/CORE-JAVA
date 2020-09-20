import java.util.Scanner;
class q30{
	public static void main(String args[]){
		int[][] a = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("enter ele: ");
			for(int j=0;j<3;j++){
			System.out.println();
			a[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		for(int i=0;i<3;i++){
			for(int j=0;j<3;j++){
				if(i == j)
					sum+= a[i][j];
			}
		}
		System.out.println("Addition of diagonal : " +sum);
	}
}