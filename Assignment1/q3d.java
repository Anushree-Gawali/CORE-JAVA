class q3d{
	public static void main(String args[]){
		boolean x = true;
		boolean y = true;
		boolean z = x && y || !(x || y);
		System.out.println("z = " +z);
	}
}
