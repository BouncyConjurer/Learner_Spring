package com.springcore.ref;

public class A {
	
	private int x;
	private B y;
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public B getY() {
		return y;
	}
	public void setY(B y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]";
	}

}
