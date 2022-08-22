package com.cg.Set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//Set<Integer>obj=new HashSet<Integer>();
		Set<Object>obj=new HashSet<Object>();
		//1.HashSet is an unordered
		obj.add("Devyani");
		obj.add('D');
		obj.add(5.8);
		obj.add(65);
		System.out.println(obj);

		

	}

}
