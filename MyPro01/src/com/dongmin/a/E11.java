package com.dongmin.a;

class OneException extends Exception{}
class TwoException extends Exception{}

public class E11 {
	private static void g() throws OneException{
		throw new OneException();
	}
	private static void f() throws Exception{
		try {
			g();
		}catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
	}
	public static void main(String[] args) {
		try {
			f();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
