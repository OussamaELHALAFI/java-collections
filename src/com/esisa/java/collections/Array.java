package com.esisa.java.collections;

public class Array {
	private String t[];
	
	public  Array() {
		t = new String[0];
	}
	
	public void add(String element) {
		String tmp[] = new String[t.length+1];
		for (int i = 0; i < t.length; i++) {
			tmp[i]=t[i];
		}
		tmp[t.length] = element;
		t = tmp;
	}
	
	public int size() {
		return t.length;
	}
	
	public String get(int index) {
		return t[index];
	}
	
	public void sort() {
		int min;
		for (int i = 0; i < t.length-1; i++) {
			min = i;
			for (int j = i + 1; j < t.length; j++) {
				if (t[j].compareTo(t[min]) < 0) {
					min = j;
				}
			}
			String tmp = t[min];
			t[min] = t[i];
			t[i] = tmp;
		}
	}
	
	public String toString() {
		StringBuffer s = new StringBuffer("{");
		if(t.length > 0) {
		s.append(t[0]);
		for (int i = 1; i < t.length; i++) {
			s.append(", " + t[i]);
		}
		}
		s.append("}");
		return s.toString();
	}
	
	 

}
