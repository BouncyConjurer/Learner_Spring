package com.springcore.autowired.xml;

public class Pata {
	
	private String gali;
	private String sheher;
	public String getGali() {
		return gali;
	}
	public void setGali(String gali) {
		this.gali = gali;
	}
	public String getSheher() {
		return sheher;
	}
	public void setSheher(String sheher) {
		this.sheher = sheher;
	}
	@Override
	public String toString() {
		return "Pata [gali=" + gali + ", sheher=" + sheher + "]";
	}
	public Pata() {
		
		super();
		System.out.println("Calling Cons..");
	}

	
	
}