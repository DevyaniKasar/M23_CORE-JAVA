package com.cg.SuperKeyword;
class A
{
	public int pin;
	public void display(int pin)
	{
		System.out.println("Pin is: "+pin);
	}
}
class B extends A
{
	public int pin;
	public void display(int pin)
	{
		System.out.println("Pin is: "+pin);
	}
	public void print()
	{
		
		display(3124);//child class method
		super.display(3221);//parent class method
	}
}
public class Super_Method {

	public static void main(String[] args) {
		B b=new B();
		b.print();
	}

}
