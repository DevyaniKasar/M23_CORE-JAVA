package com.capgemini.introduction;

import java.util.Scanner;

//Program on boolean
public class BooleanProgram {

	public static void main(String[] args) {
		System.out.println("Enter the value x:");
		Scanner s= new Scanner(System.in);
		boolean x=s.nextBoolean();
		System.out.println(x);
        s.close();
	}

}
