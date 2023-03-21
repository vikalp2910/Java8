package org.edu.vikson.programs;

import java.util.List;

public class P14FlatMapPojo {
	
	private int id;
	private String name ;
	private List<String> city;
	
	
	
	public P14FlatMapPojo(int id, String name, List<String> city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "FlatMapPojo [id=" + id + ", name=" + name + ", city=" + city + "]";
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCity() {
		return city;
	}
	public void setCity(List<String> city) {
		this.city = city;
	}
	
	

}
