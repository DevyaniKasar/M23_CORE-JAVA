package com.cg.inheritance;
//single inheritance
class A
{
	protected int rollno;
	void print()
	{
		System.out.println("hey guys! what's going on?");
	}
 
}
class B extends A{
	void accept() {
		System.out.println("rollno is:" +rollno);
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		B b=new B();
		b.rollno=121;
		b.accept();
		b.print();

	}

}
