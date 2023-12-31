package com.springcore.autowired.xml;

public class Aadmi {
	
	private Pata nayaPata;
	private Zameen nayZameen;
	
	
	public Aadmi(Pata nayaPata) {
		super();
		this.nayaPata = nayaPata;
	}


	public Pata getNayaPata() {
		return nayaPata;
	}
	public void setNayaPata(Pata nayaPata) {
		this.nayaPata = nayaPata;
	}
	public Zameen getNayZameen() {
		return nayZameen;
	}
	public void setNayZameen(Zameen nayZameen) {
		this.nayZameen = nayZameen;
	}


	@Override
	public String toString() {
		return "Aadmi [nayaPata=" + nayaPata + ", nayZameen=" + nayZameen + "]";
	}

}
