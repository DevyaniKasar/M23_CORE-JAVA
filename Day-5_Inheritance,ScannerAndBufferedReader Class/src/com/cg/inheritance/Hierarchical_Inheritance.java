package com.cg.inheritance;
//Hierarchical Inheritance
class Parent
{
	
	void print()
	{
		System.out.println("Parent");
	}
 
}
class Child extends Parent{
	void accept() {
		System.out.println("Child");
	}
}
class Baby extends Parent{
	void display() {
		System.out.println("Baby");
	}
}
public class Hierarchical_Inheritance {

	public static void main(String[] args) {
		Baby b= new Baby();
		Child c=new Child();
		b.display();
		b.print();
		c.accept();
	}

}
