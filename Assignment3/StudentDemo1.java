class Student{
	private int Rno;
	private String Name;
	private static int count =0;
	void setData(int rno,String name){
		Rno = rno;
		Name = name;
	}
	void showData(){
		System.out.println(Rno+"  "+Name);
	}
	Student(){
	count++;	
	}
	static void getCount(){
	System.out.println("Object no: "+count);
	}
}
class StudentDemo1{
	public static void main(String args[]){
	Student s = new Student();
	s.setData(20,"Anushree");
	s.showData();
	Student s1 = new Student();
	Student s2 = new Student();
	Student s3 = new Student();
	Student.getCount();
	}
}