package com.esisa.java.collections;

import java.awt.Color;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
	public Main() {
		exp10();
	}
	
	void exp01() {
		int t1[] = {20, 30, 40};
		for(int i = 0; i < t1.length; i++) {
			System.out.println(t1[i]);
		}
	}
	
	void exp02() {
		Vector<Object> t1 = new Vector<Object>();
		t1.add(new Point(20, 30));//affectation fille mere
		t1.add("Une chaine");
		t1.add(20);// autoboxing + affectation fille mere
		
		for (int i = 0; i < t1.size(); i++) {
			System.out.println(t1.get(i));
		}
		
	}
	
	void exp03() {
		Vector<Point> t1 = new Vector<>();
		t1.add(new Point(20, 30));//affectation fille mere
		t1.add(new Point(43, 12));
		t1.add(new Point(29, 13));
		t1.add(new Pixel(24, 35, Color.BLUE));
		
		for (int i = 0; i < t1.size(); i++) {
			System.out.println(t1.get(i));
		}
		
	}
	
	void exp04() {
		Vector<Point> t1 = new Vector<>();
		t1.add(new Point(20, 30));//affectation fille mere
		t1.add(new Point(43, 12));
		t1.add(new Point(29, 13));
		t1.add(new Pixel(24, 35, Color.BLUE));
		
		for (Point p : t1) {
			p.print();
		}
		
	}
	
	void exp05() {
		LinkedList<Point> t1 = new LinkedList<>();
		t1.add(new Point(20, 30));//affectation fille mere
		t1.add(new Point(43, 12));
		t1.add(new Point(29, 13));
		t1.add(new Pixel(24, 35, Color.BLUE));
		
		for (Point p : t1) {
			p.print();
		}
		
	}
	
	void exp06() {
		Array t1 = new Array();
		t1.add("Souris");
		t1.add("Clavier");
		t1.add("ecran");
		
		for (int i = 0; i < t1.size(); i++) {
			System.out.println(t1.get(i));
		}
	}
	
	void exp07() {
		Array t1 = new Array();
		t1.add("Souris");
		t1.add("Clavier");
		t1.add("ecran");
		t1.sort();
		System.out.println(t1);
	}
	
	void afficher(int m[][]) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				System.out.print("\t" + m[i][j]);
			}
			System.out.println();
		}
	}
	
	void exp08() {
		int m1[][] = {
				{23, 24, 54, 12},
				{20, 30},
				{29, 27, 56}
		};
		afficher(m1);
	}
	
	void exp09() {
		int n1[][] = new int[3][5];
		for (int i = 0; i < n1.length; i++) {
			for (int j = 0; j < n1[i].length; j++) {
				n1[i][j] = (i + 1) * (j + 1);
			}
		}
		afficher(n1);
	}
	
	void exp10() {
		int m1[][] = new int[3][];
		m1[0] = new int[] {20, 30, 40, 50};
		m1[1] = new int[2];
		m1[2] = new int[3];
		
		afficher(m1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
