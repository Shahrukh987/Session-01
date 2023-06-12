package day01;

public class Usingmethod {
	String name;
	int age;
	double hight;
	
	void insert(String name,int age, double hight)
	{
		this.name=name;
		this.age=age;
		this.hight=hight;
		
	}
	void display()
	{
		System.out.println("name = "+name );
		System.out.println("age = "+age );
		System.out.println("hight = "+hight );
		
	}
	
}
