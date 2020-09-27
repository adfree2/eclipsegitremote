package com.dongmin.a;

public class Sequence {
	private Object[] items;
	private int next = 0;
	public Sequence(int size) {
		items = new Object[size];
	}
	public void add(Object x) {
		if(next < items.length) {
			items[next++] = x;
		}else {
			throw new RuntimeException("Array Size!!!");
		}
	}
	public static void main(String[] args) {
		Sequence sequence = new Sequence(10);
		for(int i=0; i<12; i++) {
			sequence.add(Integer.toString(i));
		}
	}
}
