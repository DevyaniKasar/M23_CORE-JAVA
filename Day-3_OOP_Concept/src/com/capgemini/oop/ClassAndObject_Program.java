package com.capgemini.oop;
//program on class and object


class A {
	//variable
	   int  a;
	   //user-defined method
	   void display() {
		   System.out.println("welcome");
	   }
}
public class ClassAndObject_Program {
       
       
	public static void main(String[] args) {
		//object creation
		A obj=new A();
		//accessing the class method
	    obj.display();
	    //accessing the class variable
	    obj.a=5;
		System.out.println(obj.a);
	}  
}

