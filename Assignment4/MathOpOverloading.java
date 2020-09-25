class MathOperation
{
 static void multiply(int n1,int n2)
 {
	 int a= n1*n2;
	 System.out.println("output1 : "+a);
 }
 static void multiply(float n1,float n2,float n3)
 {
	 float b= n1*n2*n3;
	 System.out.println("output2 : "+b);
 }
 static void multiply(int arr[]) {
		
		int res = 1;
		
		for(int i=0; i<arr.length; i++) {
			
			res = res * arr[i];
		}
		
		System.out.println("output3 : "+res);
	}

 static void multiply(double n1,int n2)
 {
	 double d= n1*n2;
	 System.out.println("output4 : "+d);
 }
}

class MathOpOverloading
{
	public static void main(String args[])
	{
		MathOperation.multiply(10,10);
		MathOperation.multiply(2.3f,4.3f,4.6f);
		int arr[] = new int[] {10, 20, 30};
		
		MathOperation.multiply(arr);
		MathOperation.multiply(20.03,10);
	}
}
