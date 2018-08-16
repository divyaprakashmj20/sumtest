package com.nissan.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class testcalc {

	@Test
	public void testadd() {
		calc c= new calc();
		
		assertEquals(10,c.add(5,5));
	}
	
	@Test
	public void testsub() {
		calc c= new calc();
		
		assertEquals(10,c.sub(15,5));
	}
	
	@Test
	public void testmul() {
		calc c= new calc();
		
		assertEquals(10,c.mul(5,2));
	}
	
	@Test
	public void testdiv() {
		calc c= new calc();
		
		assertEquals(1,c.div(5,5));
		assertEquals(0,c.div(5,0));
	}
	
	

}
