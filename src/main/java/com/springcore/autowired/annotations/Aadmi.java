package com.springcore.autowired.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Aadmi {
	
	
	private Pata nayaPata;
	
	
	public Aadmi() {
		super();
	}

	
	public Aadmi(Pata nayaPata) {
		super();
		this.nayaPata = nayaPata;
	}


	public Pata getNayaPata() {
		return nayaPata;
	}
	
	@Autowired
	@Qualifier("nayaPata2")
	public void setNayaPata(Pata nayaPata) {
		this.nayaPata = nayaPata;
	}

	@Override
	public String toString() {
		return "Aadmi [nayaPata=" + nayaPata + "]";
	}

}
