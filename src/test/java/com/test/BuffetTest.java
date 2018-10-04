package com.test;

import org.junit.Before;
import org.junit.Test;

import com.main.Buffet;

public class BuffetTest {
	
	public int number;
	public Buffet buf;
	@Before
	public void before() {
		this.number = 0;
		this.buf = new Buffet();
		
	}
	@Test
	public void getNumberFromSetNumberByNumber3() {
		this.number = 3;
		
		int expected = 3;
		buf.setNumber(this.number);
		int actual = 3;
		
	}
}
