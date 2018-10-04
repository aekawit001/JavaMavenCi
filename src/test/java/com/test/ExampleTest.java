package com.test;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

	@Test
	public void test() {
		//init value
		int score =80;
	
		// expected
		String experted = "A";
	
		//actual
		String actual =  "C";
		//test
		Assert.assertEquals(experted, actual);
		
	}

}
