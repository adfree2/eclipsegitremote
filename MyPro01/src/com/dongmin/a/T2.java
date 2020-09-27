package com.dongmin.a;

class VeryImportantException extends Exception {
	public String toString() {
		return "A very important exception!";
	}
}

class HoHumException extends Exception {
	public String toString() {
		return "A trivial exception";
	}
}

public class T2 {
	void f() throws VeryImportantException {
		throw new VeryImportantException();
	}
	void dispose() throws HoHumException {
		throw new HoHumException();
	}
	public static void main(String[] args) {
		try {
			T2 lm = new T2();
			try {
				try {
					lm.f();
					throw new Exception("world");
				}finally {
					System.out.println("hello");
				}
			}finally {
				lm.dispose();
			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
