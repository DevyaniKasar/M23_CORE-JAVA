package com.capgemini.oop;

import java.util.Scanner;

class Vehicle
{
	//variable
	int a;
	//user-define method
	void display()
	{
		System.out.println("Welcome");
	}
}
public class RuntimeClassAndObject {

	public static void main(String[] args) {
		
		System.out.println("Enter the value of a: ");
		//scanner class
		Scanner s1=new Scanner(System.in);
		int a =s1.nextInt();
		
		//object creation
		Vehicle obj=new Vehicle();
		
	    //accessing the class method
		obj.display();
		//accessing the  class variable
		//obj.a=50;
		System.out.println(a);
		s1.close();
	}

}
