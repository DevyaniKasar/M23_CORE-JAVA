package com.cg.Testing;

import org.junit.jupiter.api.RepeatedTest;

public class RepeatedTestDemo 
{
	//it will repeat the test for given set of time
	@RepeatedTest(5)
	void print()
	{
		
		System.out.println("Hey Guys! Whats going on?");
	}

}