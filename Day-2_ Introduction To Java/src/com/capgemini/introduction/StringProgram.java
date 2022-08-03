package com.capgemini.introduction;

import java.util.Scanner;

//program on string
public class StringProgram {

	public static void main(String[] args) {
		System.out.println("Enter the value x:");
		Scanner s= new Scanner(System.in);
		//next() will take only first word
		//nextLine() will take the entire line
		//String x1 =s.next();
		
		String x=s.nextLine();
		System.out.println(x);
		s.close();
	}

}
