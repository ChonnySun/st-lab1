package com.triangle;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class tesyTriangle {
		private Triangle tri0;
		@Before
		public void setUp(){
		tri0 = new Triangle();
		}
		
		@Test
		 public void testTri(){
			assertEquals("It's not a triangle",tri0.tri1(1,2,5));
			assertEquals("The triangle is the equilateral",tri0.tri1(6,6,6));
			assertEquals("The triangle is the isosceles",tri0.tri1(6,6,5));
			assertEquals("The triangle is the scalene",tri0.tri1(4,5,6));

	}

}
