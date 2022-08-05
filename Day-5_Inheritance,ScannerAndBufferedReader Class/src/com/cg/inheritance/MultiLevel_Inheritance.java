package com.cg.inheritance;
//MultiLevel Inheritance
class Father
{
	int rollno;
	void print()
	{
		System.out.println("hey guys! what's going on?");
	}
 
}
class Son extends Father{
	void accept() {
		System.out.println("rollno is:" +rollno);
	}
}
class Daughter extends Son{
	void display() {
		System.out.println("Hiee");
	}
}
public class MultiLevel_Inheritance {

	public static void main(String[] args) {
		Daughter d=new Daughter();
		d.rollno=121;
		d.accept();
		d.print();
		d.display();

	}

}
