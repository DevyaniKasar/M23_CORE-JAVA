package com.cg.Testing;

import org.junit.jupiter.api.Test;

public class HelloWorldTest implements TestLifeCycleMethod
{
	@Test
	void print()
	{
		System.out.println("Hello World");
	}

}
