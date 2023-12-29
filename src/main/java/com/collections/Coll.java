package com.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Coll {
	
	private String name;
	private List<Integer> phones;
	private Set<String> addresses;
	private Map<String, Integer> courses;
	private Properties prop;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Integer> getPhones() {
		return phones;
	}
	public void setPhones(List<Integer> phones) {
		this.phones = phones;
	}
	public Set<String> getAddresses() {
		return addresses;
	}
	public void setAddresses(Set<String> addresses) {
		this.addresses = addresses;
	}
	public Map<String, Integer> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}
	public Properties getProp() {
		return prop;
	}
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	public Coll(String name, List<Integer> phones, Set<String> addresses, Map<String, Integer> courses,
			Properties prop) {
		super();
		this.name = name;
		this.phones = phones;
		this.addresses = addresses;
		this.courses = courses;
		this.prop = prop;
	}
	public Coll() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Coll [name=" + name + ", phones=" + phones + ", addresses=" + addresses + ", courses=" + courses
				+ ", prop=" + prop + "]";
	}
}
