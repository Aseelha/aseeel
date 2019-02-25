package test;

import static org.junit.Assert.*;

import org.junit.Test;

import aseelsoft.myclass;

public class classtestTest {

	@Test
	public void test() {
		myclass book=new myclass ();
		//bkobjs.addlist_book(120, "java");
		assertEquals(0,book. getcount(), 0);}
		@Test
		public void test2() {
			myclass book=new myclass ();
			book.addbook(127, "java");
			assertEquals(1,book.  getcount(), 0);
		    assertEquals(127,book.getprice(), 0);
		}
		@Test
		public void test3() {
			myclass book=new myclass ();
	    book.addbook(127, "java");
		book.addbook(100, "wep");
		assertEquals(2,book. getcount(), 0);
	    assertEquals(227,book.getprice(), 0);
		}



}
