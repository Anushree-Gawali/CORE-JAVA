class q13b{
	public static void main(String args[]){
		int x=10,y=50,z=30;
		int g =z>(x> y ? x:y) ? z:((x>y)?x:y); 
		System.out.println("The greatest number is " +g);
		}
}