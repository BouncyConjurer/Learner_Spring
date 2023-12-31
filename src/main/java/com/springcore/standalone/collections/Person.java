package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
	
	private List<String> games;
	private Map<Integer, String> specs;
	private Properties land;

	

	public List<String> getGames() {
		return games;
	}



	public void setGames(List<String> games) {
		this.games = games;
	}



	public Map<Integer, String> getSpecs() {
		return specs;
	}



	public void setSpecs(Map<Integer, String> specs) {
		this.specs = specs;
	}



	public Properties getLand() {
		return land;
	}



	public void setLand(Properties land) {
		this.land = land;
	}



	@Override
	public String toString() {
		return "Person [games=" + games + ", specs=" + specs + ", land=" + land + "]";
	}
	
}
