package com.capgemini.oop;
class Animal
{
	int x;
	//non-parameterised constructor
	Animal()
	{
		x=10;
	}
	void display()
	{
		System.out.println("Lion"+x);
	}
}

public class NonParameterizedConstructor {

	public static void main(String[] args) {
		Animal a=new Animal();
		a.display();

	}

}
