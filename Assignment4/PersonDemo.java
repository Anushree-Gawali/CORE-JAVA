class Person
{
	private int age;
	private String name;
	
	Person()
	{
		age=18;
		name="atharv";
	}
	Person(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	
	void display()
	{
		System.out.println(age+" "+name);
	}
}

class PersonDemo
{
	public static void main(String args[])
	{
		Person P=new Person();
		P.display();
		Person P1=new Person(22,"akshay");
		P1.display();
	}
}