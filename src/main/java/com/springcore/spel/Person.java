package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	@Value("#{22.65+54.890}")
	private double s1;
	
	@Value("#{54+90}")
	private int i1;
	
	@Value("#{ T(java.lang.Math).sqrt(225) }")
	private int f1;
	
	@Value("#{ T(java.lang.Math).E }")
	private float g1;
	
	@Value("#{ new java.lang.String('Praveen') }")
	private String h1;
	
	@Value("#{ 9-7>1 }")
	private boolean isActive;
	
//	public String getH1() {
//		return h1;
//	}
//	public void setH1(String h1) {
//		this.h1 = h1;
//	}
//	public void setG1(float g1) {
//		this.g1 = g1;
//	}
//	public float getG1() {
//		return g1;
//	}
//	public void setG1(int g1) {
//		this.g1 = g1;
//	}
//	public int getF1() {
//		return f1;
//	}
//	public void setF1(int f1) {
//		this.f1 = f1;
//	}
//	public double getS1() {
//		return s1;
//	}
//	public void setS1(double s1) {
//		this.s1 = s1;
//	}
//	public int getI1() {
//		return i1;
//	}
//	public void setI1(int i1) {
//		this.i1 = i1;
//	}
	@Override
	public String toString() {
		return "Person [s1=" + s1 + ", i1=" + i1 + ", f1=" + f1 + ", g1=" + g1 + ", h1=" + h1 + ", isActive=" + isActive
				+ "]";
	}
	
	
	
}
