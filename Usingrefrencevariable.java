package day01;

public class Usingrefrencevariable {

	String name;
	int age;
	double hight;
	
//	void display()
//	{
//		System.out.println("name = "+name );
//		System.out.println("age = "+age );
//		System.out.println("hight = "+hight );
//		
//	}
	
	public static void main(String[] args) {

		Usingrefrencevariable r1 = new Usingrefrencevariable();
		r1.name="shahrukh";
		r1.age=22;
		r1.hight=5.4;
//		r1.display();
		
		System.out.println("name = "+r1.name);
		System.out.println("age = "+r1.age );
		System.out.println("hight = "+r1.hight );
		
	}

}
