package com.dongmin.a;

class MyException1 extends Exception{}
class MyException2 extends Exception{}
class MyException3 extends Exception{}

/**
 * 
 * @author Administrator
 *
 */
public class E9 {
	public static void f() throws MyException1 {
		throw new MyException1();
	}
	public static void main(String[] args) {
		
	}
}
