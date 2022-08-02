package com.capgemini.introduction;
//program on character
import java.util.Scanner;

public class CharProgram {

	public static void main(String[] args) {
		//complie time 
		char x='a';
		System.out.println(x);
		    //runtime
			System.out.println("Enter the value x1:");
			Scanner s= new Scanner(System.in);
			char x1=s.next().charAt(0);
			System.out.println(x1);


	}

}
