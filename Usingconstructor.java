package day01;

public class Usingconstructor {
	String name;
	int age;
	double hight;
	
	Usingconstructor(String name,int age, double hight)
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
