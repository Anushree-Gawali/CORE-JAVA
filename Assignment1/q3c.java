class q3c{
	public static void main(String args[]){
		int x = 2,y=1;
		int z = ((x++) - (--y) - (--x) + (x++));
		System.out.println("x = " +x);
		System.out.println("y = " +y);
		System.out.println("z = " +z);
	}
}
