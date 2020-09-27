package com.dongmin.a;

class TException extends Exception {
	public TException(String msg) {
		super(msg);
	}
}

public class NeverCaught {
	static void f() throws TException {
//		throw new RuntimeException("From f()");
		throw new TException("From f()");
	}
	static void g() throws TException {
		f();
	}
	public static void main(String[] args) {
		try {
			g();
		} catch (TException e) {
			e.printStackTrace();
		}
	}
}
