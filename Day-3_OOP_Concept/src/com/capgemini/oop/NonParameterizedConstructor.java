package com.capgemini.oop;
class Animal
{
	int x;
	//(Default)non-parameterized constructor
	Animal()
	{
		x=10;
	}
	void display()
	{
		// + is used for concatenation
		System.out.println("Lion"+x);
	}
}

public class NonParameterizedConstructor {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.display();

	}

}
