
class q27{
	public static void main(String args[]){
		int [] n = {10,15,21,14,26,45,35};
		int large=0,small=n[0];
		for(int i=1;i<n.length;++i){
			if(n[i]>large)
			large = n[i];
			if(n[i]<small)
			small = n[i];
			
		}
		System.out.println("Largest and smallest umber are :" +large+ "  " +small);
	}
}
			