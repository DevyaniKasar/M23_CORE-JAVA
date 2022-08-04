package com.capgemini.oop;
class Pulser
{
	//class variable
	public int speed;
	public String color;
	
	//parameterized constructor
	/*Pulser(int speed,String color)
	{
		this.speed=speed;
		this.color=color;
	}*/
	
	Pulser(int sp,String col)
	{
		speed=sp;
		color=col;
	}
	
	void accept()
	{
		System.out.println("Speed is: "+speed+"km/hr" + " and color is: "+color);
	}
}

public class ParameterizedConstructor {
public static void main(String[] args) {
		
			Pulser p=new Pulser(50,"Black");
			p.accept();

		
	}

}
