package com.cg.Testing;


import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestsDemo
{
	@ParameterizedTest
	@ValueSource(strings= {"Neha","Monika"})
	void print(String word)
	{
		assertNotNull(word);
	}

}
